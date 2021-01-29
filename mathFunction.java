public class Main {
  static String mathFunction(int number1, int number2, int number3) {
  String result = "";
	  if (number1 + number2==number3) {
		  result= "+";	 
		}
	 if (number1 - number2==number3) {
		  result= result + "-";
		}
	if (number1 * number2==number3) {
		  result= result + "*";
		}
    if (number2!=0){
	if (number1 / number2==number3) {
		  result= result + "/";
		}}		
	if (result==""){
			result="None";}
    return result;
  }

  public static void main(String[] args) {
  System.out.println(mathFunction(1,2,3));
  }
  
}