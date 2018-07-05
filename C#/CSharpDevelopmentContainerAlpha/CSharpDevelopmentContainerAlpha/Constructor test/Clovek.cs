using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor_test
{
	public class Clovek
	{

		private string meno;
		private int vek;
		private string zamestnanie;

		public Clovek(string meno, int vek, string zam)
		{

			this.meno = meno;
			this.vek = vek;
			this.zamestnanie = zam;
		}

		public Clovek(string meno, int vek) : this(meno, vek, "nezamestnany") { }




		public void Zostarni(int pocetRokov)
		{
			vek += pocetRokov;
		}

		public int GetVek()
		{
			return vek;
		}

		public virtual void Pozdrav()
		{

			Console.WriteLine("Ahoj, ja som {0} a mám {1} rokov", meno, vek);

		}

		public string GetZamestnanie()
		{
			return zamestnanie;
		}

	}
}