class Main {

  public static void main(String[] args) {
    new Main().init();
  }

  void init() {

    String message = "attack! Take no prisoners.";

    // ENCODING
    String step1 = reverse(message);
    String step2 = encode(step1);
    String step3 = vowelToNumber(step2);
    String step4 = addAy(step3);
    String step5 = wingdingsEncode(step4);

    System.out.println("Encoded Message:");
    System.out.println(step5);

    // DECODING (reverse order)
    String d1 = wingdingsDecode(step5);
    String d2 = removeAy(d1);
    String d3 = numberToVowel(d2);
    String d4 = decode(d3);
    String d5 = reverse(d4);

    System.out.println("\nDecoded Message:");
    System.out.println(d5);
  }

  // 1. Reverse
  String reverse(String txt) {
    String bld = "";
    for (int i = txt.length() - 1; i >= 0; i--) {
      bld += txt.charAt(i);
    }
    return bld;
  }

  // 2. Caesar cipher (+2)
  String encode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      if (Character.isLetter(c)) {
        bld += (char)(c + 2);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  String decode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      if (Character.isLetter(c)) {
        bld += (char)(c - 2);
      } else {
        bld += c;
      }
    }
    return bld;
  }

  // 3. Vowels → Numbers
  String vowelToNumber(String txt) {
    return txt.replace('a','1')
              .replace('e','2')
              .replace('i','3')
              .replace('o','4')
              .replace('u','5');
  }

  String numberToVowel(String txt) {
    return txt.replace('1','a')
              .replace('2','e')
              .replace('3','i')
              .replace('4','o')
              .replace('5','u');
  }

  // 4. Add "ay"
  String addAy(String txt) {
    String[] words = txt.split(" ");
    String bld = "";
    for (String w : words) {
      bld += w + "ay ";
    }
    return bld.trim();
  }

  String removeAy(String txt) {
    String[] words = txt.split(" ");
    String bld = "";
    for (String w : words) {
      bld += w.substring(0, w.length() - 2) + " ";
    }
    return bld.trim();
  }

  // 5. Wingdings (simulated symbol encoding)
  String wingdingsEncode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      bld += (char)(c + 100);
    }
    return bld;
  }

  String wingdingsDecode(String txt) {
    String bld = "";
    for (int i = 0; i < txt.length(); i++) {
      char c = txt.charAt(i);
      bld += (char)(c - 100);
    }
    return bld;
  }
}