class delrep
{
	public static void main(String args[])
	{
	int a[]={12,16,20,20,21,24,25,27,28,28,29,30,31,32,32,35,36,36,36,37,39,40,40,41,41,42,43,43,44,44,44,45,45,47,47,48,48,48,48,49,49,49,50,52,52,52,53,53,54,54,55,55,56,56,56,57,57,59,59,60,60,60,60,61,61,61,61,61,63,64,64,65,65,65,66,66,67,67,67,68,68,68,68,68,69,69,70,70,71,71,71,72,72,72,72,72,72,72,73,73,73,73,74,75,75,76,76,76,77,77,77,77,78,78,79,79,79,79,79,80,80,80,80,81,81,83,83,83,83,84,84,84,84,84,84,85,85,86,86,87,87,88,88,88,88,89,89,89,90,90,90,90,91,91,91,91,91,91,92,92,92,92,92,92,93,93,93,94,95,95,95,95,95,96,96,96,96,96,96,97,97,97,97,97,97,98,98,99,99,99,99,100,100,100,100,100,100,101,101,101,101,101,101,102,102,102,103,103,103,103,103,103,104,104,104,104,104,105,105,106,106,106,107,107,107,107,107,108,108,108,108,108,108,108,108,108,109,109,109,109,109,110,110,110,111,111,111,112,112,112,112,112,112,113,113,113,113,113,114,114,115,115,115,115,115,115,116,116,116,116,116,116,116,117,117,117,117,117,118,119,119,119,119,120,120,120,120,120,120,120,120,120,120,121,121,121,121,121,121,121,122,122,123,123,123,124,124,124,124,124,124,125,125,125,125,125,125,125,126,126,126,126,126,127,127,127,127,127,128,128,128,128,128,128,128,128,129,129,129,129,129,129,129,130,130,130,130,131,131,131,131,132,132,132,132,132,132,132,132,132,133,133,133,133,133,133,133,133,134,134,134,134,135,135,136,136,136,136,137,137,137,137,137,137,137,138,138,138,139,139,139,139,139,139,139,139,140,140,140,140,140,140,140,141,141,141,141,141,142,142,142,142,143,143,143,143,143,143,144,144,144,144,144,144,144,144,144,144,144,145,145,145,145,145,145,146,146,146,146,147,147,147,147,148,148,148,148,148,148,148,148,148,149,149,149,149,149,149,149,149,150,150,150,150,150,150,151,151,151,151,151,151,151,151,151,152,152,152,152,152,152,152,152,153,153,153,153,153,153,154,154,154,154,154,155,155,155,155,155,155,155,155,156,156,156,156,156,156,156,156,156,156,156,157,157,157,157,157,157,157,157,157,158,158,158,158,159,159,159,159,159,160,160,160,160,160,160,160,161,161,161,161,161,161,161,162,162,162,162,162,162,163,163,163,163,163,163,164,164,164,164,164,164,164,164,164,165,165,165,165,165,166,166,166,166,167,167,167,167,167,167,167,167,167,168,168,168,168,168,168,168,168,168,168,168,168,169,169,169,169,169,169,169,169,169,170,170,170,170,170,171,171,171,171,171,171,172,172,172,172,172,172,172,172,172,173,173,173,173,173,173,173,173,173,174,174,174,174,174,175,175,175,175,175,175,175,176,176,176,176,176,176,176,176,176,176,176,177,177,177,177,177,177,177,177,178,178,178,178,178,179,179,179,179,179,179,179,179,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,181,181,181,181,181,181,181,181,181,181,182,182,182,182,183,183,183,183,183,184,184,184,184,184,184,184,184,184,184,185,185,185,185,185,185,186,186,186,187,187,187,187,187,187,187,187,188,188,188,188,188,188,188,188,188,188,188,189,189,189,189,189,189,190,190,190,191,191,191,191,191,191,191,191,191,192,192,192,192,192,192,192,192,192,192,192,192,193,193,193,193,193,193,193,193,193,193,194,194,194,194,194,195,195,195,195,196,196,196,196,196,196,196,196,197,197,197,197,197,197,197,197,197,197,198,198,198,198,198,198,198,198,199,199,199,199,199,199,199,199,199,199,200};
	int i=0,j=0;
	int b[]=new int[172];
	int temp=1;
	for(i=0;i<a.length;i++)
		{
		if (a[i]>temp)
			{
			b[j]=a[i];
			j++;
			temp=a[i];
			}
		}
	for(j=0;j<b.length;j++)
		System.out.print(b[j]+",");
	}
}