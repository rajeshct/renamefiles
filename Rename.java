import java.io.File;


public class Check {
public static void main(String[] ar)
{File temporay=new File("ab.txt");
int l=0;
String getPath=temporay.getAbsolutePath().replace("\\ab.txt","");
String directoryName=getPath.substring((getPath.lastIndexOf("\\")+1));
getPath+="\\";
File f1=new File(getPath);
String[] getAllFile=f1.list();  //get all file in current directory
for(int i=0;i<getAllFile.length;i++)
{    String type=getAllFile[i].substring(getAllFile[i].lastIndexOf("."),getAllFile[i].length());
	 l++;
     File fz=new File(getAllFile[i]);
	 File gh=new File(new StringBuffer(directoryName).append(l).append(type).toString());
	 fz.renameTo(gh);
}
}
}


