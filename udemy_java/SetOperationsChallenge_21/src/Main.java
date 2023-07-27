import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Task> tasks=TaskData.getTasks("all");
        sortAndPrint("All Tasks",tasks);


        Comparator<Task> sortByPriority=Comparator.comparing(Task::getPriority);

        Set<Task> annsTasks=TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks",annsTasks,sortByPriority);

        getEquals("ann","bob","carol");





    }
    private static void getUnassigned(){
        var unassignedTasks=new HashSet<>(TaskData.getTasks("all"));
        unassignedTasks.removeAll(getAllAssigned());
        System.out.println("-".repeat(90));
        System.out.println("unassignedTasks:");
        unassignedTasks.forEach(System.out::println);



    }
    private static Set<Task> getAllAssigned(){
        var assignedTasks=new HashSet<>(TaskData.getTasks("ann"));
        assignedTasks.addAll(TaskData.getTasks("bob"));
        assignedTasks.addAll(TaskData.getTasks("carol"));
        return assignedTasks;




    }
    private static void getEquals(String owner1,String owner2,String owner3){
        var owner1Tasks=TaskData.getTasks(owner1);
        var owner2Tasks=TaskData.getTasks(owner2);
        owner1Tasks.retainAll(owner2Tasks);


        if(owner3!=null){
            var owner3Tasks=TaskData.getTasks(owner3);

            owner1Tasks.retainAll(owner3Tasks);
            System.out.println("-".repeat(90));
            System.out.println("Projects that belongs all workers:");
            System.out.println("-".repeat(90));
            owner1Tasks.forEach(task-> System.out.println("%-20s %s".formatted(task.getProject(),task.getDescription())));

        }
        else{
            System.out.println("-".repeat(90));
            System.out.println("Projects that belongs to %s and %s :".formatted(owner1,owner2));
            System.out.println("-".repeat(90));
            owner1Tasks.forEach(task-> System.out.println("%-20s %s".formatted(task.getProject(),task.getDescription())));

        }

    }

    private static void sortAndPrint(String header,Collection<Task> collection){
        sortAndPrint(header,collection,null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter){
        String lineSeperator="_".repeat(90);
        System.out.println(lineSeperator);
        System.out.println(header);
        System.out.println(lineSeperator);

        List<Task> list=new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

}