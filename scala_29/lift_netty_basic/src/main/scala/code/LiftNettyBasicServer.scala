package code

import org.jboss.netty.channel.group.DefaultChannelGroup
import org.jboss.netty.handler.codec.http.{HttpResponseEncoder, HttpRequestDecoder}
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory
import java.util.concurrent.Executors
import org.jboss.netty.bootstrap.ServerBootstrap
import java.net.InetSocketAddress
import org.jboss.netty.channel.ChannelFactory
import net.liftweb.http.provider.netty.LiftPipelineFactory


object LiftNettyBasicServer extends App {

  val allChannels = new DefaultChannelGroup("lift-netty-example-server")

  private[this] val factory: ChannelFactory = new NioServerSocketChannelFactory(
    Executors.newCachedThreadPool(),
    Executors.newCachedThreadPool()
  )

  private[this] val bootstrap = new ServerBootstrap(factory)

  bootstrap.setPipelineFactory(new LiftPipelineFactory)

  bootstrap.setOption("child.tcpNoDelay", true)
  bootstrap.setOption("child.keepAlive", true)

  val port = 8080
  val boundChannel = bootstrap.bind(new InetSocketAddress(port))
  println("Lift-Netty Server Started on port %s" format port)

  allChannels.add(boundChannel)

}