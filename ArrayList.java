
public class ArrayList implements List {
	int size = 0;
	private Object arr [] = new Object [10];

	public void add(Object obj)
	{
		if (arr.length == size)
		{
			grow_array();
		}

		arr[size] = obj;
		++size;

	}
	public void add(int pos, Object obj)
	{
		if (pos < 0 || pos > size)
		{
			throw new IllegalArgumentException("Invalid range");
		}
		if (arr.length == size)
		{
			grow_array();
		}

		for (int i = size; i > pos; i --)
		{
			arr[i] = arr[i-1];
		}
		size++;
		arr[pos]=obj;

	}
	public Object get(int pos)
	{
		return arr[pos];

	}

	public Object remove(int pos)
	{
		if (pos < 0 || pos >= size)
		{
            throw new IllegalArgumentException("Invalid range");
		}

		Object obj = arr[pos];

		for (int i = pos; i < size-1; i++)
		{
			arr[i] = arr[i+1];
		}
		--size;
		return obj;

	}
	  
	public int size()
	{
		return size;
	}

	private void grow_array() {
		Object newArr[] = new Object[arr.length*2];
		for(int i = 0; i < size; i++){
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

}
