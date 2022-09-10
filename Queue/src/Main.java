
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee srivas = new Employee(123, "sri", "vas");
		Employee saisthvik = new Employee(234,  "sai", "sathvik");
		Employee anithabhoo = new Employee(456, "anitha", "bhoo");
		Employee babyhimani = new Employee(5678, "baby", "himani");
		Employee macMillicon = new Employee(7890, "mac", "Millicon");
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(srivas);
		queue.add(saisthvik);
		queue.add(anithabhoo);
		queue.add(babyhimani);
		queue.add(macMillicon);
		//queue.printQueue();
		
		queue.remove();
		queue.remove();
		//queue.printQueue();
		
		System.out.println(queue.peek());
		queue.printQueue();

	}

}
