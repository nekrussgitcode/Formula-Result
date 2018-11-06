package infixToPostFix;

/*Cоздавал стек изначально на массиве, ибо хотел, чтобы он был независим от LinkedList. 
Однако, нашлось решение:На практике, стеки требуются
не громадных размеров, к тому же размер массива стека можно задать вручную

*/
public class MyStack<T> {

	private int maxSize; 			// его размер, который мы вводим вместе с типом при
									// создании
	private T[] stackArray;			// стек основан на массиве
	private int top; 				// вершина стэка
	// T object;

	public MyStack(int s) {

		top = -1;

		maxSize = s;
		stackArray = (T[]) (new Object[maxSize]);	// поэтому создаем массив из
													// объектов и передаем их
													// нашему типy
	}

	public void push(T j) {
		stackArray[++top] = j;
	}

	public T pop() {
		return stackArray[top--]; // извлечение елемента и уменьшения top
	}

	public T peek() { // просто смотрим верхний элемент. чтение с вершины
		return stackArray[top];
	}

	public boolean isEmpty() { // пустой ли стэк
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public T peekN(int n) { 
		return stackArray[n];
	}
	
	public int size(){
		return top+1;
	}
	
	public void displayStack(String s){
		System.out.print(s);
		System.out.print("Stack (bottom-->top): ");
		for (int j=0; j<size(); j++){
			System.out.print(peekN(j));
			System.out.print(' ');
		}
		System.out.println("");
	}

}
