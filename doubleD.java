package Wrapper;

public class DoubleD
	{

		public static void main(String[] args)
		{
			final long start = System.currentTimeMillis();

			double d = 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d;

			for (int i = 0; i < 1_000_000_000; i++)

			{
				d++;

			}
			final long finish = System.currentTimeMillis();

			System.out.println("Using double: " + d + " Elapsed milliseconds: "
					+ (finish - start));

			final long start1 = System.currentTimeMillis();

			Double d1 = 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d;
			// Double d1 =
			// 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d;

			for (int i = 0; i < 1_000_000_000; i++)

			{
				d1++;

			}
			final long finish1 = System.currentTimeMillis();

			System.out.println("Using DOUBLE: " + d1
					+ " Elapsed milliseconds: " + (finish1 - start1));
			System.out.println("The double is faster than the DOUBLE by : "
					+ ((finish1 - start1) - (finish - start))
					+ "    milliseconds");
			double dblSpeed = (finish - start);
			double dBLSpeed = (finish1 - start1);
			System.out.println("OMG! double is " + (dBLSpeed / dblSpeed)
					+ "  times faster than Double");
		}

	}
