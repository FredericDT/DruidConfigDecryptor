package onl.fdt.utils.druid.decryptor;

import com.alibaba.druid.filter.config.ConfigTools;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length > 0) {
            for (int i = 1; i < args.length; i += 2) {
                System.out.println(ConfigTools.decrypt(
                        args[i - 1], // publickey text
                        args[i] // cipher
                ));
            }
        } else {
            System.out.println("Usage: java -jar DruidConfigDecryptor-1.0-SNAPSHOT-jar-with-dependencies.jar <publickey_text> <cipher_text>");
        }
    }
}
