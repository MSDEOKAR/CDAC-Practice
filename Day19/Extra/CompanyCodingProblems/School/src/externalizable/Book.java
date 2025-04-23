package externalizable;

import java.io.BufferedReader;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Book implements Externalizable
{
	private String strName;
	private String strAuthor;
	private double dPrice;
	public Book()
	{
		
	}
	
	public Book(String strName, String strAuthor, double dPrice)
	{
		super();
		this.strName = strName;
		this.strAuthor = strAuthor;
		this.dPrice = dPrice;
	}

	@Override
	public String toString() {
		return "Book [dPrice=" + dPrice + ", strAuthor=" + strAuthor
				+ ", strName=" + strName + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException 
	{
		strName =in.readLine();
		strAuthor = in.readLine();
		dPrice = in.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException 
	{
		
		out.writeUTF(strName);
		out.writeUTF(strAuthor);
		out.writeDouble(dPrice);
	}
	
	public static void main(String[] args)
	{
		Book b = new Book();
		
		
	}

}
