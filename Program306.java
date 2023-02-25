From: "Saved by Internet Explorer 11"
Subject: 
Date: Sat, 25 Feb 2023 15:20:17 +0530
MIME-Version: 1.0
Content-Type: text/html;
	charset="Windows-1252"
Content-Transfer-Encoding: quoted-printable
Content-Location: file://D:\JAVA FULL STACK\Program306.java
X-MimeOLE: Produced By Microsoft MimeOLE

<!DOCTYPE HTML>
<!DOCTYPE html PUBLIC "" ""><HTML><HEAD><META content=3D"IE=3D11.0000"=20
http-equiv=3D"X-UA-Compatible">

<META http-equiv=3D"Content-Type" content=3D"text/html; =
charset=3Dwindows-1252">
<META name=3D"GENERATOR" content=3D"MSHTML 11.00.10570.1001"></HEAD>
<BODY>
<PRE>import java.util.Scanner;=0A=
class Program306=0A=
{=0A=
	static void displayMonth(int month_no)=0A=
	{=0A=
		String s=3Dnew String();=0A=
        if(month_no=3D=3D0) s=3D"Jan";break;=0A=
		else if(month_no=3D=3D1)s =3D"Feb";=0A=
		else if(month_no=3D=3D2)s=3D"Mar";=0A=
		else if(month_no=3D=3D3)s=3D"Apr";=0A=
		else if(month_no=3D=3D4)s=3D"May";=0A=
		else if(month_no=3D=3D5)s=3D"June";=0A=
		else if(month_no=3D=3D6)s=3D"July";=0A=
        else if(month_no=3D=3D1)s =3D"Aug";=0A=
		else if(month_no=3D=3D2)s=3D"Sep";=0A=
		else if(month_no=3D=3D3)s=3D"Oct";=0A=
		else if(month_no=3D=3D4)s=3D"Nov";=0A=
		else if(month_no=3D=3D5)s=3D"Dec";=0A=
		default s=3D"Incorrect month number";=0A=
		System.out.println("Month is:"+s);=0A=
	}=0A=
public static void main(String[] args)=0A=
{=0A=
	Scanner sc=3Dnew Scanner(System.in);=0A=
	System.out.println("Enter the month numbers(0-12):");=0A=
	int month_no=3Dsc.nextInt();=0A=
	displayMonth(month_no);=0A=
	}=0A=
}</PRE></BODY></HTML>
