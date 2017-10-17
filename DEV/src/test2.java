class a111
{
	private int n;
	String s;

	public int getN()
	{
		return n;
	}

	public void setN(int n)
	{
		this.n = n;
	}

	public String getS()
	{
		return s;
	}

	public void setS(String s)
	{
		this.s = s;
	}

	@Override
	public String toString()
	{
		return " n=" + n + ", s=" + s + " ";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + n;
		result = prime * result + (s == null ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		a111 other = (a111) obj;
		if (n != other.n)
			return false;
		if (s == null)
		{
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

}

class test2 extends a111
{

	public static void main(String g[])
	{
		String s[] =
		{ "dev", "sonu", "monu", "ram" };
		a111 b = new a111();
		b.setN(10);
		b.setS("dev");
		System.out.println(b);
		printMark(s);
	}

	private static void printMark(String[] g)
	{
		for (String string : g)
			System.out.println(string);
	}
}
