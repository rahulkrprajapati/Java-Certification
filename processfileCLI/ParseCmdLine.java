package processfileCLI;
import java.io.*;

class ParseCmdLine {
    static String globalString = "";
    public static void addPageNum(boolean inplace, String fileName){
        try {
            // input the (modified) file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            int num = 1;
            while ((line = file.readLine()) != null) {
                line = num + " " + line; // replace the line here
                inputBuffer.append(line);
                inputBuffer.append('\n');
                num++;
            }
            file.close();
            
            if(inplace){
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream(fileName);
                fileOut.write(inputBuffer.toString().getBytes());
                fileOut.close();
                System.out.println("Nothing sent to stdout");
                System.err.println("Nothing sent to stderr");
            }
            else{
                if(globalString.length() == 0){
                    globalString = inputBuffer.toString();
                }
                else{
                    StringBuffer inputBuffer2 = new StringBuffer();
                    String[] lines = globalString.split("\n");
                    num = 1;
                    for (String l : lines) {
                        l = num + " " + l; // replace the line here
                        inputBuffer2.append(l);
                        inputBuffer2.append('\n');
                        num++;
                    }
                    globalString = inputBuffer2.toString();
                }
                // System.out.println(globalString);
                System.err.println("Nothing sent to stderr");
            }
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }

    }
    public static void keepLinesFile(boolean inplace, String fileName, boolean caseinsensitive, String searchline){
        try {
            // input the (modified) file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            while ((line = file.readLine()) != null) {
                if(caseinsensitive){
                    if(line.toLowerCase().contains(searchline.toLowerCase())){ // replace the line here
                        inputBuffer.append(line);
                        inputBuffer.append('\n');
                    }
                }
                else{
                    if(line.contains(searchline)){ // replace the line here
                        inputBuffer.append(line);
                        inputBuffer.append('\n');
                    }
                }
            }
            file.close();
            
            if(inplace){
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream(fileName);
                fileOut.write(inputBuffer.toString().getBytes());
                fileOut.close();
                System.out.println("Nothing sent to stdout");
                System.err.println("Nothing sent to stderr");
            }
            else{
                if(globalString.length() == 0){
                    globalString = inputBuffer.toString();
                }
                else{
                    StringBuffer inputBuffer2 = new StringBuffer();
                    String[] lines = globalString.split("\n");
                    for (String l : lines) {
                        if(caseinsensitive){
                            if(l.toLowerCase().contains(searchline.toLowerCase())){ // replace the line here
                                inputBuffer2.append(l);
                                inputBuffer2.append('\n');
                            }
                        }
                        else{
                            if(l.contains(searchline)){ // replace the line here
                                inputBuffer2.append(l);
                                inputBuffer2.append('\n');
                            }
                        }
                    }
                    globalString = inputBuffer2.toString();
                }
                // System.out.println(globalString);
                System.err.println("Nothing sent to stderr");
            }
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }

    }

    public static void replaceWord(boolean inplace, String fileName, String firstinstance, String firstinstancereplacement, boolean replaceall, boolean caseinsensitive){
            try {
                // input the (modified) file content to the StringBuffer "input"
                BufferedReader file = new BufferedReader(new FileReader(fileName));
                StringBuffer inputBuffer = new StringBuffer();
                String line;
                while ((line = file.readLine()) != null) {
                    if(replaceall){
                        if(caseinsensitive){
                            line = line.replaceAll("(?i)"+ firstinstance, firstinstancereplacement); // replace the line here
                            inputBuffer.append(line);
                            inputBuffer.append('\n');    
                        }
                        else{
                            line = line.replaceAll(firstinstance, firstinstancereplacement); // replace the line here
                            inputBuffer.append(line);
                            inputBuffer.append('\n');
                        }
                    }
                    else{
                        if(caseinsensitive){
                            line = line.replaceFirst("(?i)"+ firstinstance, firstinstancereplacement); // replace the line here
                            inputBuffer.append(line);
                            inputBuffer.append('\n');
                        }
                        else{
                            line = line.replaceFirst(firstinstance, firstinstancereplacement); // replace the line here
                            inputBuffer.append(line);
                            inputBuffer.append('\n');
                        }
                    }
                }
                file.close();
                
                if(inplace){
                    // write the new string with the replaced line OVER the same file
                    FileOutputStream fileOut = new FileOutputStream(fileName);
                    fileOut.write(inputBuffer.toString().getBytes());
                    fileOut.close();
                    System.out.println("Nothing sent to stdout");
                    System.err.println("Nothing sent to stderr");
                }
                else{
                    if(globalString.length() == 0){
                        globalString = inputBuffer.toString();
                    }
                    else{
                        StringBuffer inputBuffer2 = new StringBuffer();
                        String[] lines = globalString.split("\n");
                        for (String l : lines) {
                            if(replaceall){
                                if(caseinsensitive){
                                    l = l.replaceAll("(?i)"+ firstinstance, firstinstancereplacement); // replace the line here
                                    inputBuffer2.append(l);
                                    inputBuffer2.append('\n');    
                                }
                                else{
                                    l = l.replaceAll(firstinstance, firstinstancereplacement); // replace the line here
                                    inputBuffer2.append(l);
                                    inputBuffer2.append('\n');
                                }
                            }
                            else{
                                if(caseinsensitive){
                                    l = l.replaceFirst("(?i)"+ firstinstance, firstinstancereplacement); // replace the line here
                                    inputBuffer2.append(l);
                                    inputBuffer2.append('\n');
                                }
                                else{
                                    l = l.replaceFirst(firstinstance, firstinstancereplacement); // replace the line here
                                    inputBuffer2.append(l);
                                    inputBuffer2.append('\n');
                                }
                            }
                        }
                        globalString = inputBuffer2.toString();
                    }
                    // System.out.println(globalString);
                    System.err.println("Nothing sent to stderr");
                }
            } catch (Exception e) {
                System.out.println("Problem reading file.");
            }

        }

    public static void addPrefixWord(boolean inplace, String fileName, String prefixline){
        try {
            // input the (modified) file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            while ((line = file.readLine()) != null) {
                line = prefixline + line; // replace the line here
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            
            if(inplace){
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream(fileName);
                fileOut.write(inputBuffer.toString().getBytes());
                fileOut.close();
                System.out.println("Nothing sent to stdout");
                System.err.println("Nothing sent to stderr");
            }
            else{
                if(globalString.length() == 0){
                    globalString = inputBuffer.toString();
                }
                else{
                    StringBuffer inputBuffer2 = new StringBuffer();
                    String[] lines = globalString.split("\n");
                    for (String l : lines) {
                        l = prefixline + l; // replace the line here
                        inputBuffer2.append(l);
                        inputBuffer2.append('\n');
                    }
                    globalString = inputBuffer2.toString();
                }
                // System.out.println(globalString);
                System.err.println("Nothing sent to stderr");
            }
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
    }
    public static void main(String[] args) {

        int i = 0, j;
        String arg;
        char flag;
        boolean vflag = false;
        String outputfile = "";

        //adding new flags
        boolean inPlace = false;
        boolean lineNum = false;
        boolean keepLines = false;
        boolean replaceFirst = false;
        boolean replaceAll = false;
        boolean caseInSensitive = false;
        boolean addPrefix = false;

        //adding new variables
        String firstInstance = "";
        String firstInstanceReplacement = "";
        String searchLine = "";
        String prefixLine = "";
        String filename = "";

        

        while (i < args.length && args[i].startsWith("-")) {
            arg = args[i++];

            // use this type of check for "wordy" arguments
            if (arg.equals("-f")) {
                System.out.println("editing file in place");
                inPlace = true;
            }
            if (arg.equals("-n")) {
                System.out.println("adding numbers to file lines");
                lineNum = true;
            }
            if (arg.equals("-g")) {
                System.out.println("replacing all occurances");
                replaceAll = true;
            }
            if (arg.equals("-i")) {
                System.out.println("case insensitive matching activated");
                caseInSensitive = true;
            }

            // use this type of check for arguments that require arguments
            else if (arg.equals("-r")) {
                replaceFirst = true;
                if (i < args.length){
                    firstInstance = args[i++];
                    firstInstanceReplacement = args[i++];
                    if(firstInstance.length() == 0)
                        System.err.println("String1 is empty in -r flag");
                }
                else
                    System.err.println("-r requires a two strings");
            }

            else if (arg.equals("-s")) {
                keepLines = true;
                if (i < args.length){
                    searchLine = args[i++];
                }
                else
                    System.err.println("-s requires a one string to search");
            }

            else if (arg.equals("-p")) {
                addPrefix = true;
                if (i < args.length){
                    prefixLine = args[i++];
                }
                else
                    System.err.println("-p requires a string to prefix");
            }
        }
        if (replaceAll == true && replaceFirst == false){
            System.err.println("Specifying -g flag without the -r flag");
        }
        if(caseInSensitive == true && (keepLines == false && replaceFirst == false)){
            System.err.println("Specifying -i without either having specified option -s or option -r");
        }
        if (i == args.length)
            System.err.println("Usage: processfile [ -f | -n | -s string | -r string1 string2 | -g | -i | -p  ] FILE");
        else
            filename = args[args.length - 1];
            // System.out.println("Success!");

            if(keepLines){
                keepLinesFile(inPlace, filename,caseInSensitive,searchLine);
            }
            if(replaceFirst){
                replaceWord(inPlace, filename, firstInstance, firstInstanceReplacement, replaceAll, caseInSensitive);
            }
            if(addPrefix){
                addPrefixWord(inPlace, filename, prefixLine);
            }
            if(lineNum){
                addPageNum(inPlace, filename);
            }

            if(!inPlace){
                System.out.println(globalString);
            }
    }

}
