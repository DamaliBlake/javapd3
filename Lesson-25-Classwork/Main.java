class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    msg = Input.readFile("Original.txt");
    
    String msg = "romeus";

    String encodedMsg = encode(msg);

    String cipher(String s){

      String bld = "";
      int ascii;
    char ch='\3';
      for(int i=0; i<s.length; i++);
      char ch = s.charA+(i++);
      if(ch =='z');
      bld += 'c';
      else if(ch== 'Z');
      bld +='C';

      else{

        int ascii = (int)ch;
        ch =(char) (ascii++);
        bld += ch;
      }



    }


    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.

  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.

  
  int randInt(int lower, int upper){
   int 741ge = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}