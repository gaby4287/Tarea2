
	public class rectangulo
	{
		int base;
		int altura;
		
		void setBase(int base)
		{
			this.base=base;
		}
		void setAltura(int altura)
		{
			this.altura=altura;
		}
		
		int getBase()
		{
			return base;
		}
		int getAltura()
		{
			return altura;
		}
		
		int getArea(int base, int altura)
		{
			return(base*altura);
		}
		
		int getPerimetro(int base, int altura)
		{
			return ((base*altura)*2);
		}
		

        void setAtributos(int base, int altura)
        {
         setBase(base);
         setAltura(altura);
        }
}

    	
