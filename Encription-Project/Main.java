class Main {

  public static void main(String[] args) {
    new Main().init();
  }

  void init() {

    // Read original text
    String file = Input.readFile("Original.txt");

    // ENCRYPTION
    String e1 = swapLetters(file);
    String e2 = encode(e1);
    String e3 = vowelEncrypt(e2);
    String e4 = addAy(e3);
    String e5 = wingdingsEncrypt(e4);
    String e6 = reverse(e5);

    Input.writeFile("Encoded.txt", e6);

    // DECRYPTION
    String file2 = Input.readFile("Encoded.txt");

    String d1 = reverse(file2);
    String d2 = wingdingsDecrypt(d1);
    String d3 = removeAy(d2);
    String d4 = vowelDecrypt(d3);
    String d5 = decode(d4);
    String d6 = swapLetters(d5);

    Input.writeFile("Decoded.txt", d6);
  }

  // 1. Swap letters
  String swapLetters(String txt) {
    char[] arr = txt.toCharArray();
    for (int i = 0; i < arr.length - 1; i += 2) {
      char temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    return new String(arr);
  }

  // 2. Caesar shift +2
  String encode(String txt) {
    String bld = "";
    for (char c : txt.toCharArray()) {
      if (Character.isLetter(c)) {
        bld += (char)(c + 2);
      } 
      else {
        bld += c;
      }
    }
    return bld;
  }

  String decode(String txt) {
    String bld = "";
    for (char c : txt.toCharArray()) {
      if (Character.isLetter(c)) {
        bld += (char)(c - 2);
      } 
      else {
        bld += c;
      }
    }
    return bld;
  }

  // 3. Replace vowels with numbers
  String vowelEncrypt(String txt) {
    return txt.replace("a","1").replace("e","2")
              .replace("i","3").replace("o","4")
              .replace("u","5");
  }

  String vowelDecrypt(String txt) {
    return txt.replace("1","a").replace("2","e")
              .replace("3","i").replace("4","o")
              .replace("5","u");
  }

  // 4. Add "ay" to each word
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
      if (w.endsWith("ay")) {
        bld += w.substring(0, w.length() - 2) + " ";
      }
    }
    return bld.trim();
  }

  // 5. Wingdings 
  String wingdingsEncrypt(String txt) {
    return txt.replace("a","@").replace("b","#")
              .replace("c","$").replace("d","%")
              .replace("e","&");
  }

  String wingdingsDecrypt(String txt) {
    return txt.replace("@","a").replace("#","b")
              .replace("$","c").replace("%","d")
              .replace("&","e");
  }

  // 6. Reverse string
  String reverse(String txt) {
    String bld = "";
    for (int i = txt.length() - 1; i >= 0; i--) {
      bld += txt.charAt(i);
    }
    return bld;
  }
}