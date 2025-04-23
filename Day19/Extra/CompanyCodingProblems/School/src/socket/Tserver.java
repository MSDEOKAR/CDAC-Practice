package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Tserver 
{
	public static void main(String[] args)
	{
		Tserver objTelemedServer =new Tserver();
		objTelemedServer.start();

	}
	public void start()
	{

		try 
		{
			ServerSocket server = new ServerSocket(9993);
			System.out.println("Server Started");
			Thread thread  = null;
			Socket soc = null;
			while(true)
			{
				soc = server.accept();
				RequestHandler objHandler = new RequestHandler(soc);
				thread = new Thread(objHandler);
				thread.start();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}

}
