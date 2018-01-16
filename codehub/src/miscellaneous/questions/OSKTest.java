package miscellaneous.questions;

public class OSKTest
{

	private String newMthod(String str)
	{
		if (str.contains("\""))
		{
			// System.out.println("in if");
			str = str.replaceAll("\"", "\"\"");
			str = "\"" + str + "\"";
		}

		if (str.contains(","))
			str = "\"" + str + "\"";
		return str;
	}

	private String printString(String str)
	{
		String res = null;
		if (str == null)
			return null;
		if (str.contains(",") && !str.contains("\""))
		{
			res = "\"" + str + "\"";

		}

		else if (str.contains(",") && str.contains("\""))
		{
			res = "\"" + str.replaceAll("\"", "\"\"") + "\"";

		} else if (!str.contains(",") && str.contains("\""))
		{
			// System.out.println("djsdj");
			res = "\"" + str.replaceAll("\"", "\"\"") + "\"";

		} else
			res = str;

		if (res.contains("�") && (res.contains("\"") || res.contains(",")))
			res = res.replaceAll("�", "��");
		else if (!res.contains("�")
				|| (!res.contains("\"") || !res.contains(",")))
			res = res;
		else
			res = "\"" + res.replaceAll("�", "��") + "\"";
		return res;

	}

	public static void main(String[] args)
	{

		OSKTest ot = new OSKTest();
		String s = "dev";
		String res = null;
		// System.out.println(res);
		if (s.contains("�"))
			res = "\"" + s.replaceAll("�", "\"\"") + "\"";

		// System.out.println(res);
		System.out.println(ot.printString(s));
		// System.out.println(ot.newMthod(s));

	}

}
