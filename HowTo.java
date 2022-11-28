import java.util.*;

// package cheatsheet;

class HowTo{
  
  public static void main(String[] args) {
    System.out.println("hello world");
    DATA_STRUCTURES();
  };
  
  // initalize data structures
  public static void DATA_STRUCTURES(){
    // 1. Arrays
    System.out.println("------------------ARRAYS--------------------");
    int[] data = {1, 2, 3, 4};
    System.out.println(data[0]);
    for(int i : data){
      System.out.println(i);
    };

    // 2. ArrayLists
    System.out.println("------------------ARRAYLIST--------------------");
    ArrayList<String> dataList = new ArrayList<String>();
    dataList.add("Elaine");
    dataList.add("bao");
    dataList.add(1, "wilbur");

    System.out.println(dataList.get(1));
    dataList.remove(1);
    dataList.remove("bao");
    System.out.println(dataList);

    // 3. LinkedList
    System.out.println("------------------LINKEDLIST--------------------");
    LinkedList<String> linkedData = new LinkedList<>();
    linkedData.add("Angel");
    linkedData.add("wilbur");
    linkedData.add(1, "buster");
    System.out.println(linkedData);
    System.out.println(linkedData.get(0));

    linkedData.remove("buster");
    linkedData.remove(1);
    linkedData.remove(); // removes first elem in linked list
    System.out.println(linkedData);

    // 4. HashMaps
    System.out.println("------------------HASHMAP--------------------");
    HashMap<String, Integer> plants = new HashMap<>();

    plants.put("tomato", 10);
    plants.put("lemon", 0);
    plants.put("basil", 10);

    System.out.println(plants.size());

    for(String key : plants.keySet()){
      System.out.println("Key: " + key + ", value: " + plants.get(key));
    }

    plants.remove("tomato");
    System.out.println(plants);

    // 5. HashSets
    System.out.println("------------------HASHSET--------------------");
    HashSet<String> flavors = new HashSet<>();

    flavors.add("peach");
    flavors.add("banana");
    flavors.add("chocolate");

    System.out.println(flavors.contains("peach"));
    System.out.println(flavors.size());

    for(String item: flavors){
      System.out.println(item);
    }

    flavors.remove("peach");

    System.out.println(flavors.contains("peach"));
    System.out.println(flavors.size());


     // 6. Stacks
     System.out.println("------------------STACK--------------------");

     Stack<Integer> numbers = new Stack<>();
     numbers.push(1);
     numbers.push(2);
     numbers.push(3);
     System.out.println(numbers);
     numbers.pop();
     System.out.println(numbers);
     System.out.println(numbers.peek());
     System.out.println(numbers.isEmpty());
     System.out.println(numbers.search(2));

     // 7. Queues
     System.out.println("------------------Queues--------------------");
     Queue<String> queue = new PriorityQueue<>();

     queue.add("hello");
     queue.add("world");
     queue.add("I'm");
     queue.add("Elaine");
     System.out.println(queue.size());
     System.out.println(queue);

     for(String word : queue){
      System.out.println(word);
     }

     queue.remove("I'm");
     queue.remove("world");
     System.out.println(queue);
     System.out.println(queue.peek());
  };
}