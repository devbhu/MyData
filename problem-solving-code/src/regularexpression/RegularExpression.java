package regularexpression;

import java.io.*;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ExtractMobNo {
    PrintWriter printWriter;
    BufferedReader bufferedReader;

    void extract() {
        System.out.println("Extracting mobile no from input file");
        try {
            printWriter = new PrintWriter("C:\\Users\\devsingh3\\project\\MyData\\problem-solving-code\\src\\regularexpression\\output.txt");
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\devsingh3\\project\\MyData\\problem-solving-code\\src\\regularexpression\\input.txt"));
            String line = bufferedReader.readLine();
            Pattern pattern = Pattern.compile("(0/91)?[a-zA-Z0-9]{9}");
            while (Objects.nonNull(line)) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    printWriter.println(matcher.group());
                }
                line=bufferedReader.readLine();
            }
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            printWriter.flush();
        }

    }
}

class EmailId {
    Pattern pattern;
    String mobNo;

    public EmailId(Pattern pattern, String mailId) {
        this.pattern = pattern;
        this.mobNo = mailId;
    }

    void checkEmailId() {
        Matcher matcher = pattern.matcher(mobNo);
        if (matcher.find() && matcher.group().equals(mobNo)) {
            System.out.println("valid email id");
        } else {
            System.out.println("invalid email id");
        }
    }
}

class MobileNo {
    Pattern pattern;
    String mobNo;

    public MobileNo(Pattern pattern, String mobNo) {
        this.pattern = pattern;
        this.mobNo = mobNo;
    }

    void checkIndiaMobNo() {
        Matcher matcher = pattern.matcher(mobNo);
        if (matcher.find() && matcher.group().equals(mobNo)) {
            System.out.println("valid mob no");
        } else {
            System.out.println("invalid mob no");
        }
    }
}

class TXTFile{
    void printTextFileName(){
        File file = new File("C:\\Users\\devsingh3\\project\\MyData\\problem-solving-code\\src\\regularexpression");
        String a[] = file.list();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$]*[.]txt");
        int count =0;
        for (String s : a){
            Matcher matcher= pattern.matcher(s);
            if(matcher.find() && matcher.group().equals(s)){
                System.out.println(s);
                count++;
            }

        }
        System.out.println("total text file"+count);
    }
}
public class RegularExpression {
    public static void main(String a[]) {
        MobileNo mobileNo = new MobileNo(Pattern.compile("(0|91)?[7-9][0-9]{9}"), "918553934533");
        MobileNo mobileNo1 = new MobileNo(Pattern.compile("(0|91)?[7-9][0-9]{9}"), "8957471387");
        MobileNo mobileNo2 = new MobileNo(Pattern.compile("(0|91)?[7-9][0-9]{9}"), "08957471387");
        MobileNo mobileNo3 = new MobileNo(Pattern.compile("(0|91)?[7-9][0-9]{9}"), "928957471387");
        MobileNo mobileNo4 = new MobileNo(Pattern.compile("(0|91)?[7-9][0-9]{9}"), "92929687868786");
        mobileNo.checkIndiaMobNo();
        mobileNo1.checkIndiaMobNo();
        mobileNo2.checkIndiaMobNo();
        mobileNo3.checkIndiaMobNo();
        mobileNo4.checkIndiaMobNo();
        EmailId emailId = new EmailId(Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+"), "devmanisingh.bhMCA11@gmail.com");
        emailId.checkEmailId();
        EmailId emailId1 = new EmailId(Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+"), "de@gmail.com");
        emailId1.checkEmailId();
        EmailId emailId2 = new EmailId(Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+"), "detgmail.com");
        emailId2.checkEmailId();
        ExtractMobNo extractMobNo= new ExtractMobNo();
        extractMobNo.extract();
        TXTFile txtFile=new TXTFile();
        txtFile.printTextFileName();
    }
}
