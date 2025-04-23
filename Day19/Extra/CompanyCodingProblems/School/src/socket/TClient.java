package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TClient 
{
	public static final int CHUNKSIZE= 102400;
	public static void main(String[] args) 
	{
		TClient objClient = new TClient();
		objClient.sendFile("F:\\Sample_Repository\\Images\\JPGs\\head1.jpg");
	}
	public void sendFile(String strFilePath)
	{

		try 
		{
			Socket objSocket = new Socket("127.0.0.1",9993);
			DataOutputStream dos = new DataOutputStream(objSocket.getOutputStream());
			DataInputStream dis = new DataInputStream(objSocket.getInputStream());
			File objFile = new File(strFilePath);
			if(objFile.exists())
			{

				FileInputStream objFileInputStream = new FileInputStream(strFilePath);

				String strFileName = strFilePath.substring(strFilePath.lastIndexOf("\\")+1);

				dos.writeUTF(strFileName);
				
				int iFileSize = (int)objFile.length();
				dos.writeInt(iFileSize);
				int iNumberOfBytesRead = 0;
				byte byteBuffer[] = null;
				while(iFileSize > 0)
				{
					if(iFileSize >=CHUNKSIZE)
					{
						byteBuffer= new byte[CHUNKSIZE];
						iNumberOfBytesRead = objFileInputStream.read(byteBuffer);
						dos.write(byteBuffer,0,iNumberOfBytesRead);
						iFileSize -= iNumberOfBytesRead;
					}
					else
					{
						byteBuffer = new byte[iFileSize];
						iNumberOfBytesRead = objFileInputStream.read(byteBuffer);
						dos.write(byteBuffer,0,iNumberOfBytesRead);
						iFileSize -= iNumberOfBytesRead;
					}
			    }
				
				boolean  bReached = dis.readBoolean();
				byteBuffer= null;

				if(bReached)
				{
					System.out.println("File transfered successfully");
				}
				dos.flush();
				dos.close();
				dis.close();
				objSocket.close();
			}

			else
			{
				System.out.println("file do not exists");
			}

		} catch (UnknownHostException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
