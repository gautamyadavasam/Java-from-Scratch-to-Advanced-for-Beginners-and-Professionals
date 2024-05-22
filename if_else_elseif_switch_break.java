import java.util.*;
public class if_else_elseif_switch_break {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      int button = sc.nextInt();
         
       // if(age>=18) {
       //     System.out.println("Adult");
       // } else {
        //    System.out.println("not adult");
       // }
// find a od or even no 
 //if (x % 2 == 0){
//System.out.println("even");
 //} else{
  //  System.out.println("odd5");
 //}

 //if(a>b){
    //System.out.println("a is greater ");
 /*}  else if(a<b){
        System.out.println("a is leaser");
    }
else{
    System.out.println("equal");
}*/

/*if (button == 1){
    System.out.println("hello");
}else if(button == 2 ){
    System.out.println("Nameste");
}
else if(button == 3){
    System.out.println("Bonzo");   
}
else{System.out.println("Invalid botton");

}
 }
}*/
 //switch break start from here
    switch(button) {
case 1:System.out.println("hello");
break;
case 2 :System.out.println("namestay");
break;
case 3 : System.out.println("bonzo");
break;
default: System.out.println("Invaliad key");


    }
}}

