package ProjetoTap;

import ProjetoTap.Data.Lang;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import static ProjetoTap.Main.sc;

public class Functions
{
    //      ░██████╗░███████╗███╗░░██╗███████╗██████╗░░█████╗░████████╗███████╗  ██╗██████╗░
    //      ██╔════╝░██╔════╝████╗░██║██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔════╝  ██║██╔══██╗
    //      ██║░░██╗░█████╗░░██╔██╗██║█████╗░░██████╔╝███████║░░░██║░░░█████╗░░  ██║██║░░██║
    //      ██║░░╚██╗██╔══╝░░██║╚████║██╔══╝░░██╔══██╗██╔══██║░░░██║░░░██╔══╝░░  ██║██║░░██║
    //      ╚██████╔╝███████╗██║░╚███║███████╗██║░░██║██║░░██║░░░██║░░░███████╗  ██║██████╔╝
    //      ░╚═════╝░╚══════╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝  ╚═╝╚═════╝░
    public static int generateId(Map map)
    {
        int id = 0;

        do
        {
            id++;
        } while (map.containsKey(id));

        return id;
    }
    //      ██████╗░░█████╗░███████╗░██████╗  ███████╗██╗██╗░░░░░███████╗  ███████╗██╗░░██╗██╗░██████╗████████╗
    //      ██╔══██╗██╔══██╗██╔════╝██╔════╝  ██╔════╝██║██║░░░░░██╔════╝  ██╔════╝╚██╗██╔╝██║██╔════╝╚══██╔══╝
    //      ██║░░██║██║░░██║█████╗░░╚█████╗░  █████╗░░██║██║░░░░░█████╗░░  █████╗░░░╚███╔╝░██║╚█████╗░░░░██║░░░
    //      ██║░░██║██║░░██║██╔══╝░░░╚═══██╗  ██╔══╝░░██║██║░░░░░██╔══╝░░  ██╔══╝░░░██╔██╗░██║░╚═══██╗░░░██║░░░
    //      ██████╔╝╚█████╔╝███████╗██████╔╝  ██║░░░░░██║███████╗███████╗  ███████╗██╔╝╚██╗██║██████╔╝░░░██║░░░
    //      ╚═════╝░░╚════╝░╚══════╝╚═════╝░  ╚═╝░░░░░╚═╝╚══════╝╚══════╝  ╚══════╝╚═╝░░╚═╝╚═╝╚═════╝░░░░╚═╝░░░
    public static boolean doesFileExist(String filePath)
    {
        File file = new File(filePath);

        return file.exists() && file.isFile();
    }
    //      ██████╗░██████╗░███████╗██████╗░░█████╗░██████╗░███████╗  ███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗
    //      ██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝  ████╗░████║██╔════╝████╗░██║██║░░░██║
    //      ██████╔╝██████╔╝█████╗░░██████╔╝███████║██████╔╝█████╗░░  ██╔████╔██║█████╗░░██╔██╗██║██║░░░██║
    //      ██╔═══╝░██╔══██╗██╔══╝░░██╔═══╝░██╔══██║██╔══██╗██╔══╝░░  ██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║
    //      ██║░░░░░██║░░██║███████╗██║░░░░░██║░░██║██║░░██║███████╗  ██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝
    //      ╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═╝░░░░░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝  ╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░
    public static void prepareMenu(String menuName)
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println();
        }

        System.out.println(Lang.colorCyan + "< ======= # " + menuName.toUpperCase() + " # ======= >"  + Lang.colorReset);
    }
    //      ░██████╗░███████╗████████╗  ░█████╗░██╗░░░██╗██████╗░██████╗░███████╗███╗░░██╗████████╗  ██╗░░░██╗███████╗░█████╗░██████╗░
    //      ██╔════╝░██╔════╝╚══██╔══╝  ██╔══██╗██║░░░██║██╔══██╗██╔══██╗██╔════╝████╗░██║╚══██╔══╝  ╚██╗░██╔╝██╔════╝██╔══██╗██╔══██╗
    //      ██║░░██╗░█████╗░░░░░██║░░░  ██║░░╚═╝██║░░░██║██████╔╝██████╔╝█████╗░░██╔██╗██║░░░██║░░░  ░╚████╔╝░█████╗░░███████║██████╔╝
    //      ██║░░╚██╗██╔══╝░░░░░██║░░░  ██║░░██╗██║░░░██║██╔══██╗██╔══██╗██╔══╝░░██║╚████║░░░██║░░░  ░░╚██╔╝░░██╔══╝░░██╔══██║██╔══██╗
    //      ╚██████╔╝███████╗░░░██║░░░  ╚█████╔╝╚██████╔╝██║░░██║██║░░██║███████╗██║░╚███║░░░██║░░░  ░░░██║░░░███████╗██║░░██║██║░░██║
    //      ░╚═════╝░╚══════╝░░░╚═╝░░░  ░╚════╝░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░  ░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝
    public static int getCurrentYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    //      ███████╗██████╗░██████╗░░█████╗░██████╗░  ██████╗░███████╗░██████╗███████╗████████╗
    //      ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔══██╗██╔════╝██╔════╝██╔════╝╚══██╔══╝
    //      █████╗░░██████╔╝██████╔╝██║░░██║██████╔╝  ██████╔╝█████╗░░╚█████╗░█████╗░░░░░██║░░░
    //      ██╔══╝░░██╔══██╗██╔══██╗██║░░██║██╔══██╗  ██╔══██╗██╔══╝░░░╚═══██╗██╔══╝░░░░░██║░░░
    //      ███████╗██║░░██║██║░░██║╚█████╔╝██║░░██║  ██║░░██║███████╗██████╔╝███████╗░░░██║░░░
    //      ╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝  ╚═╝░░╚═╝╚══════╝╚═════╝░╚══════╝░░░╚═╝░░░
    public static void errorReset(String message)
    {
        System.out.println(message);
        sc.nextLine();
    }
    //      ██████╗░███████╗░█████╗░██████╗░  ██████╗░░█████╗░░█████╗░██╗░░░░░███████╗░█████╗░███╗░░██╗
    //      ██╔══██╗██╔════╝██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗██╔══██╗██║░░░░░██╔════╝██╔══██╗████╗░██║
    //      ██████╔╝█████╗░░███████║██║░░██║  ██████╦╝██║░░██║██║░░██║██║░░░░░█████╗░░███████║██╔██╗██║
    //      ██╔══██╗██╔══╝░░██╔══██║██║░░██║  ██╔══██╗██║░░██║██║░░██║██║░░░░░██╔══╝░░██╔══██║██║╚████║
    //      ██║░░██║███████╗██║░░██║██████╔╝  ██████╦╝╚█████╔╝╚█████╔╝███████╗███████╗██║░░██║██║░╚███║
    //      s╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═════╝░  ╚═════╝░░╚════╝░░╚════╝░╚══════╝╚══════╝╚═╝░░╚═╝╚═╝░░╚══╝
    public static boolean readBoolean()
    {
        try
        {
            String cont = sc.next();

            if (cont.toLowerCase().equals("y") || cont.toLowerCase().equals("n"))
            {
                return cont.toLowerCase().equals("y");
            }
            else
            {
                errorReset(Lang.errorInvalidBooleanOption);
                return readBoolean();
            }
        }
        catch (Exception ignored)
        {
            errorReset(Lang.errorWrongDataType);
            return readBoolean();
        }
    }
    //      ██████╗░██████╗░███████╗░██████╗░██████╗  ███████╗███╗░░██╗████████╗███████╗██████╗░  ████████╗░█████╗░  ░█████╗░░█████╗░███╗░░██╗████████╗██╗███╗░░██╗██╗░░░██╗███████╗
    //      ██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝  ██╔════╝████╗░██║╚══██╔══╝██╔════╝██╔══██╗  ╚══██╔══╝██╔══██╗  ██╔══██╗██╔══██╗████╗░██║╚══██╔══╝██║████╗░██║██║░░░██║██╔════╝
    //      ██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░  █████╗░░██╔██╗██║░░░██║░░░█████╗░░██████╔╝  ░░░██║░░░██║░░██║  ██║░░╚═╝██║░░██║██╔██╗██║░░░██║░░░██║██╔██╗██║██║░░░██║█████╗░░
    //      ██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗  ██╔══╝░░██║╚████║░░░██║░░░██╔══╝░░██╔══██╗  ░░░██║░░░██║░░██║  ██║░░██╗██║░░██║██║╚████║░░░██║░░░██║██║╚████║██║░░░██║██╔══╝░░
    //      ██║░░░░░██║░░██║███████╗██████╔╝██████╔╝  ███████╗██║░╚███║░░░██║░░░███████╗██║░░██║  ░░░██║░░░╚█████╔╝  ╚█████╔╝╚█████╔╝██║░╚███║░░░██║░░░██║██║░╚███║╚██████╔╝███████╗
    //      ╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░  ╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚═╝  ░░░╚═╝░░░░╚════╝░  ░╚════╝░░╚════╝░╚═╝░░╚══╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░╚══════╝
    public static void pressEnterToContinue()
    {
        System.out.println("\n\n" + Lang.colorBlue + Lang.pressAnyKeyToContinue + Lang.colorReset);

        try
        {
            System.in.read();
        }
        catch (Exception ignored) { }
    }
    //      ██████╗░██████╗░██╗███╗░░██╗████████╗  ███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗
    //      ██╔══██╗██╔══██╗██║████╗░██║╚══██╔══╝  ████╗░████║██╔════╝████╗░██║██║░░░██║
    //      ██████╔╝██████╔╝██║██╔██╗██║░░░██║░░░  ██╔████╔██║█████╗░░██╔██╗██║██║░░░██║
    //      ██╔═══╝░██╔══██╗██║██║╚████║░░░██║░░░  ██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║
    //      ██║░░░░░██║░░██║██║██║░╚███║░░░██║░░░  ██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝
    //      ╚═╝░░░░░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝░░░╚═╝░░░  ╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░
    public static int printMenu(String title, ArrayList<String> options, boolean printTitle)
    {
        if (printTitle)
        {
            prepareMenu(title);
        }

        int index = 0;
        for (String option : options)
        {
            index++;
            System.out.println(Lang.colorCyan + " » " + Lang.colorGreen + index + ". " + option + Lang.colorReset);
        }
        System.out.println(Lang.colorCyan + " » " + Lang.colorYellow + "0. " + Lang.exit + Lang.colorReset);
        System.out.println(Lang.colorCyan + Lang.pick + Lang.colorReset);

        return readMenuOption(0, index);
    }
    //      ██████╗░███████╗░█████╗░██████╗░  ███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗  ░█████╗░██████╗░████████╗██╗░█████╗░███╗░░██╗
    //      ██╔══██╗██╔════╝██╔══██╗██╔══██╗  ████╗░████║██╔════╝████╗░██║██║░░░██║  ██╔══██╗██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║
    //      ██████╔╝█████╗░░███████║██║░░██║  ██╔████╔██║█████╗░░██╔██╗██║██║░░░██║  ██║░░██║██████╔╝░░░██║░░░██║██║░░██║██╔██╗██║
    //      ██╔══██╗██╔══╝░░██╔══██║██║░░██║  ██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║  ██║░░██║██╔═══╝░░░░██║░░░██║██║░░██║██║╚████║
    //      ██║░░██║███████╗██║░░██║██████╔╝  ██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝  ╚█████╔╝██║░░░░░░░░██║░░░██║╚█████╔╝██║░╚███║
    //      ╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░  ░╚════╝░╚═╝░░░░░░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝
    public static int readMenuOption(int min, int max)
    {
        try
        {
            int option = sc.nextInt();

            if (option < min || option > max)
            {
                System.out.println(Lang.errorInvalidMenuOption);
                sc.nextLine();
                return readMenuOption(min, max);
            }

            return option;
        }
        catch (Exception ignored)
        {
            System.out.println(Lang.errorWrongDataType);
            sc.nextLine();
            return readMenuOption(min, max);
        }
    }
    //      ██████╗░███████╗░█████╗░██████╗░  ░██████╗████████╗██████╗░██╗███╗░░██╗░██████╗░
    //      ██╔══██╗██╔════╝██╔══██╗██╔══██╗  ██╔════╝╚══██╔══╝██╔══██╗██║████╗░██║██╔════╝░
    //      ██████╔╝█████╗░░███████║██║░░██║  ╚█████╗░░░░██║░░░██████╔╝██║██╔██╗██║██║░░██╗░
    //      ██╔══██╗██╔══╝░░██╔══██║██║░░██║  ░╚═══██╗░░░██║░░░██╔══██╗██║██║╚████║██║░░╚██╗
    //      ██║░░██║███████╗██║░░██║██████╔╝  ██████╔╝░░░██║░░░██║░░██║██║██║░╚███║╚██████╔╝
    //      ╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═════╝░  ╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝░╚═════╝░
    public static String readString() throws IOException
    {
        String my_String;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        my_String = br.readLine();

        return my_String;
    }
    //      ██╗░░░██╗███████╗░██████╗  ░█████╗░██████╗░  ███╗░░██╗░█████╗░
    //      ╚██╗░██╔╝██╔════╝██╔════╝  ██╔══██╗██╔══██╗  ████╗░██║██╔══██╗
    //      ░╚████╔╝░█████╗░░╚█████╗░  ██║░░██║██████╔╝  ██╔██╗██║██║░░██║
    //      ░░╚██╔╝░░██╔══╝░░░╚═══██╗  ██║░░██║██╔══██╗  ██║╚████║██║░░██║
    //      ░░░██║░░░███████╗██████╔╝  ╚█████╔╝██║░░██║  ██║░╚███║╚█████╔╝
    //      ░░░╚═╝░░░╚══════╝╚═════╝░  ░╚════╝░╚═╝░░╚═╝  ╚═╝░░╚══╝░╚════╝░
    public static boolean yesOrNo(String message)
    {
        try
        {
            System.out.println(message);

            // READS 'Y' OR 'N'
            String cont = sc.next();

            // RETURN TRUE IF 'Y' OR RETURN FALSE IF 'N'
            if (cont.toLowerCase().equals("y") || cont.toLowerCase().equals("n"))
            {
                return cont.toLowerCase().equals("y");
            }
            // ERROR: ENTERED CHAR IS NEITHER 'Y' NOR 'N'
            else
            {
                errorReset(Lang.errorInvalidBooleanOption);
                return yesOrNo(message);
            }
        }
        catch (Exception ignored)
        {
            errorReset(Lang.errorWrongDataType);
            return yesOrNo(message);
        }
    }
}
