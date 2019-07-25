package com.expedia.www.hackathon;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyServer {

    private Server server;

    public void start() {
        ThreadPool threadPool = new QueuedThreadPool(10, 10, 30000);
        server = new Server(threadPool);
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8001);
        server.setConnectors(new Connector[]{connector});
        ServletContextHandler context = new ServletContextHandler(server, "/itravel");

        ServletHolder servletHolder = context.addServlet(ServletContainer.class, "/jersey/*");
        servletHolder.setInitParameter("jersey.config.server.provider.packages", "com.expedia.www.hackathon.controller");

        try{
            server.start();
            server.join();
        } catch(Exception e) {

        } finally {
            server.destroy();
        }

    }

    public static void main(String[] args) {
        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
    }
}
