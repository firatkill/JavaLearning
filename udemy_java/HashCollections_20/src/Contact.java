import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails=new HashSet<>();
    private Set<String> phones=new HashSet<>();

    Contact(String name){
        this(name,null,0);
    }
    Contact(String name,String email){
        this(name,email,0);
    }
    Contact(String name,long phone){
        this(name,null,phone);

    }
    Contact(String name,String email,long phone){
        this.name=name;
        if(email!=null) this.emails.add(email);
        if(phone>0){
            Long temp=phone;
            String phoneStr="("+temp.toString().substring(0,3)+") "+temp.toString().substring(3,6)
                    +"-"+temp.toString().substring(6);
            this.phones.add(phoneStr);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "%s: %s %s".formatted(name,emails,phones);
    }

    public Contact mergeContactData(Contact contact){
     Contact newContact = new Contact(name);
     newContact.emails=new HashSet<>(this.emails);
        newContact.phones=new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
     return newContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return 33*name.hashCode();
    }

    public void addEmail(String companyName){
        String[] names=name.split(" ");
        String email="%c%s@%s.com".formatted(name.charAt(0),names[names.length-1],companyName.replaceAll(" ","").toLowerCase());
        if(!emails.add(email)){
            System.out.println(name+ " already has email "+email );

        }else{
            System.out.println(name+" now has email "+email);
        }
    }
    public void replaceEmailIfExists(String oldEmail,String newEmail){
        if(emails.contains(oldEmail)){
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }

}
