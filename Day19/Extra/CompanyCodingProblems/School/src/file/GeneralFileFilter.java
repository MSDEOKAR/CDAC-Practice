package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Enumeration;
import java.util.Hashtable;
/*
 * This class is responsible for creating filters for files.
 * This is used by SelectRecord.java.
 * @author Praphul Kolte
 */

public class GeneralFileFilter implements FilenameFilter
{
	Hashtable<String,String> objExtTable;
	
	 public GeneralFileFilter()
	{
		objExtTable = new Hashtable<String,String>();
	}
	public GeneralFileFilter(String[] strArrFileExt)
	{
		super();
		objExtTable = new Hashtable<String,String>();
		for(int i=0;i<strArrFileExt.length; i++)
		{
			objExtTable.put(strArrFileExt[i], strArrFileExt[i]);
		}
	}

	public	GeneralFileFilter(String strFileExt)
	{
		objExtTable = new Hashtable<String,String>();
		objExtTable.put(strFileExt, strFileExt);
	}
	
	void addExtention(String strFileExt)
	{
		objExtTable.put(strFileExt, strFileExt);
	}
	
	void addExtention(String[] strArrFileExt)
	{
		for(int i=0;i<strArrFileExt.length; i++)
		{
			objExtTable.put(strArrFileExt[i], strArrFileExt[i]);
		}
	}
	
	public boolean accept(File objFile) 
	{
		if (objFile.isDirectory()) 
		{
			return true;
		}
		
		String strExtension = getExtension(objFile);
		if(null != objExtTable.get(strExtension) && strExtension != null)
		{
			return true;
		}
		else
			return false;
	}
	
	//The description of this filter
	public String getDescription() 
	{
		int iCount = objExtTable.size();
		Enumeration<String> keys = objExtTable.elements();
		StringBuffer strBufDescription = new StringBuffer();
		for(int i=0; i < iCount; i++)
		{
			strBufDescription.append("*.");
			String strExtension = (String)keys.nextElement();
			strBufDescription.append(objExtTable.get(strExtension));
			strBufDescription.append(';');
			
		}
		return strBufDescription.toString();
	}
	
	public String getExtension(File objFile) 
	{
		String strFileName = objFile.getName();
		int iIndex = strFileName.lastIndexOf('.');
		strFileName.trim();
		String strExt = strFileName.substring(iIndex);
		return  strExt;
	}
	@Override
	public boolean accept(File dir, String name)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}

