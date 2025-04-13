package InheritanceProg;

class Mobiles {
    void makeCall() {
        System.out.println("Making a call from mobile");
    }
}

class SmartPhone extends Mobiles {
    void browseInternet() {
        System.out.println("Browsing internet on smartphone");
    }
}

class AndroidPhone extends SmartPhone {
    void usePlayStore() {
        System.out.println("Using Google Play Store");
    }
}


class FeaturePhone extends Mobiles {
    void sendSMS() {
        System.out.println("Sending SMS from feature phone");
    }
}

public class Hybrid2 {
    public static void main(String[] args) {
        
        AndroidPhone android = new AndroidPhone();
        android.makeCall();       
        android.browseInternet(); 
        android.usePlayStore();
        
        FeaturePhone feature = new FeaturePhone();
        feature.makeCall(); 
        feature.sendSMS();      }
}
