import java.io.File;
public class Check {
public static void main(String[] ar)
{File f=new File("ab.txt");
int l=0;
String s=f.getAbsolutePath().replace("\\ab.txt","");
String t=s.substring((s.lastIndexOf("\\")+1));
s+="\\";
File f1=new File(s);
String[] st=f1.list();

for(int i=0;i<st.length;i++)
{if(st[i].endsWith(".png"))
	{l++;
     File fz=new File(st[i]);
	 File gh=new File(t+l+".png");
	 fz.renameTo(gh);
	}
else if(st[i].endsWith(".jpg"))
{l++;
File fz=new File(st[i]);
File gh=new File(t+l+".jpg");
fz.renameTo(gh);}
else
{
	l++;
    File fz=new File(st[i]);
	 File gh=new File(t+l+".jpeg");
	 fz.renameTo(gh);}
}
}
}
