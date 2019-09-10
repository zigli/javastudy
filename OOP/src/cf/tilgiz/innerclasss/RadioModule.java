package cf.tilgiz.innerclasss;

public class RadioModule {

    public RadioModule() {
        System.out.println("RadioModeule initialized");
    }

    public void call(String number) {
        int length = 10;

        class GSMModule {
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != length) {
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                        return false;
                    }
                }
            }

            public void dialIn() {
                if (isValid()) {
                    System.out.println("Calling phone number: " + validNumber);
                } else {
                    System.out.println("Phone number is invalid.");
                }
            }
        }

        GSMModule gsmModule = new GSMModule(number);
        gsmModule.dialIn();
    }
}
