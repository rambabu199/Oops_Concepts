interface MessageService
{
    public void sendMessage(String message, String sender);
    public void receiveMessage(String message, String sender);
}

 

class Email implements MessageService
{
    public void sendMessage(String message, String sender)
    {
        System.out.println("Sending Email to"+sender+"Message is:"+message);
    }
    public void receiveMessage(String message, String sender)
    {
        System.out.println("Receive Email From"+sender+"Message is:"+message);
    }
}
class SMS implements MessageService
{

}
class Main
{
public static void main (String[] args) 
  {
      Email em=new Email();

      em.sendMessage("Hello How are you?","eedekarunakar@gmail.com");
      em.receiveMessage("How are you?","eedekarunakar@gmail.com");
  }
}