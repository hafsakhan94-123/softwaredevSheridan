public class Exercise13
{
 
 public static void main(String[] args) {
  double side1 = 7.0;
  double side2 = 11.3;
  double hyp = calcHypotenuse(side1,side2);
  System.out.println(hyp);

  boolean flag = isValidEmail("hodaf.cmu@edu");
  System.out.println(flag);
  System.out.println(isValidEmail("hodaf_cmu_edu@"));
  System.out.println(isValidEmail("hodaf@cmu.edu"));

  String password1 = "open";
  String password2 = "sesame";
  int result = ShortWord(password1, password2);
  System.out.println("Shorter word has length "+ result);
    
  System.out.println(makeURL("yahoo"));

  double x = quadratic(1.0,3.0,2.0);
  System.out.println(x);

 }

 //DO NOT CHANGE MAIN METHOD ABOVE. HOWEVER PLEASE NOTE HOW EACH METHOD IS CALLED.
 
 //ADD THE METHOD DEFINITIONS HERE
 public static double calcHypotenuse(double base , double adjacent){
  double hyp;
  double sum = (base * base) + (adjacent * adjacent);
  hyp = Math.sqrt(sum);
  return hyp;
 }

 public static boolean isValidEmail(String email){

 int indexOfa = email.indexOf('@');
 int indexOfb = email.indexOf('.');

 if(indexOfa > -1 && indexOfb > -1){
  if(indexOfa < indexOfb){
   return true;
  }
 }
  return false;


 }

 public static int ShortWord(String a1, String b1){

  int r = a1.length();
  int r1 = b1.length();

  int num = Math.min(r,r1);
  return num;

 }

 public static String makeURL(String URL){

  String message = URL.concat(".com");
  String newMessage = "WWW." + message;
  return newMessage;
 }

 public static double quadratic(double a, double b, double c){

  double number = (b*b) - (4* a * c);
  double x = ((-b) + Math.sqrt(number)) /(2*a);
  return x;

 }


}
