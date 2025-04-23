package socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;


public class RequestHandler implements Runnable
{
	Socket soc = null;
	public static final int CHUNKSIZE= 102400;
	
	public RequestHandler(Socket clientSoc)
	{
		soc= clientSoc;
	}
	
	public void run() 
	{
		DataOutputStream objDataOutputStream=null;

		DataInputStream objDataInputStream=null;
		FileOutputStream objFileOutputStream = null;
		try
		{
			objDataOutputStream= new DataOutputStream(soc.getOutputStream());
			objDataInputStream = new DataInputStream(soc.getInputStream()); 

			String strFileName = objDataInputStream.readUTF();
			Random rand = new Random();
			int i = rand.nextInt(100);
			
			File objFile = new File("c:\\ServerStore\\"+i+strFileName);

			objFile.createNewFile();
		    objFileOutputStream = new FileOutputStream(objFile);
			int iFileSize = objDataInputStream.readInt();
			int iNumberOfBytesRead=0;
			byte byteBuffer[] = null;
			
			while(iFileSize > 0)
			{
				if(iFileSize >=CHUNKSIZE)
				{ 
					byteBuffer = new byte[CHUNKSIZE];
					iNumberOfBytesRead = objDataInputStream.read(byteBuffer);
					objFileOutputStream.write(byteBuffer,0,iNumberOfBytesRead);
					iFileSize -= iNumberOfBytesRead;
				}
				else
				{
					byteBuffer = new byte[iFileSize];
					iNumberOfBytesRead = objDataInputStream.read(byteBuffer);
					objFileOutputStream.write(byteBuffer,0,iNumberOfBytesRead);
					iFileSize -= iNumberOfBytesRead;
				}
		    }
			
			byteBuffer = null;

			System.out.println("File Received: "+ i+strFileName);
			objDataOutputStream.writeBoolean(true);

		}

		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				objDataOutputStream.flush();
				objDataOutputStream.close();
				objDataInputStream.close();
				objFileOutputStream.close();
				soc.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

	}
	}
}
