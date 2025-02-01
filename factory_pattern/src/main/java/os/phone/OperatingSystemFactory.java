package os.phone;

/**
 * This will be our main factory class, using the main factory class now, a user can pass an argument
 * to our main method, and it should generate for them the OS that they need
 */
public class OperatingSystemFactory {

    /**
     * Based on the argument you pass the factory will generate for you the necessary OS
     * @param OsName the os you want, this is a simple factory so we only have android, ios and windows in stock
     * @return an OS instance
     */
    public static OS getOSInstance(String OsName){
        if (OsName.equalsIgnoreCase("android")) {
            return new Android();
        } else if (OsName.equalsIgnoreCase("ios")) {
            return new IOS();
        }else{
            return new Windows();
        }
    }
}
