package xsl;
import java.io.*;
import jxl.*;


public class ExcelReader
{
    public static void main(String st[])
    {
         ExcelReader.readFile("D:\\PK\\POC\\Java\\School\\src\\xsl\\ABC.xls");
    }

    public static void readFile(String fileName)
     {
         try
         {
             Workbook workbook = Workbook.getWorkbook(new File(fileName));
             String sheetName[]=workbook.getSheetNames();
             Sheet sheet;
             Cell xlsCell;
             Cell[] cell;

             for(int p=0; p<sheetName.length; p++)
             {
                 sheet = workbook.getSheet(p);
                 for(int i=0; i<sheet.getRows(); i++)
                 {
                     cell = sheet.getRow(i);
                     for(int j=0; j<cell.length; j++)
                     {
                         xlsCell = sheet.getCell(j,i);
                         System.out.print(xlsCell.getContents().toString() +"\t\t");
                         
                     }
                     System.out.print("\n");
                 }
             }
         }
         catch(Exception Excp)
         {
             System.out.print("Exception "+ Excp);
         }
     }

 }
