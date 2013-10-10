import java.util.ArrayList;
import java.util.Scanner;
public class GenSqlString {
	/**
	 * 处理长字符串拼接
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
    	Scanner scn = new Scanner(System.in);
    	String line;
    	String reString;
    	System.out.println("请输入您的长字符串"); 
    	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    	//String reString="+\""+br.readLine()+" \"";
    	/** 当输入end时回车结束*/
    	while (!"end".equals(line = scn.nextLine())) {
			array.add(line);
		}
    	System.out.println("The result is: \r\n");
    	int i=1;
    	for(String str : array){
    		if(i==1){
    			reString="\""+str+" \"";
    		}else if(i==array.size()){
    		    reString="+\""+str+" \";";
    		}else{
    			reString="+\""+str+" \"";
    		}
			System.out.println(reString);
			i++;
		}
	}

}
