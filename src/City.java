public class City {
    String name;
    int population;
    Infrastructure[] info;
    
    public City(String name, int population)
    {
        this.name = name;
        this.population = population;
        info = new Infrastructure[0];
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return this.population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public Infrastructure[] getInfo()
    {
        return this.info;
    }

    public void addInfo(Infrastructure i)
    {
        Infrastructure[] temp = new Infrastructure[this.info.length+1];

        for (int m=0; m<this.info.length; m++)
        {
            temp[m] = this.info[m];
        }

        temp[this.info.length] = i;

        this.info = temp;
    }

    public class Infrastructure {
        String iName;
        int buildingsAmount;

        public Infrastructure(String iName)
        {
            this.iName = iName;
            buildingsAmount = 0;
        }

        public Infrastructure(String iName, int buildingsAmount)
        {
            this.iName = iName;
            this.buildingsAmount = buildingsAmount;
        }

        public String getIName()
        {   
            return this.iName;
        }

        public void setIName(String iName)
        {
            this.iName = iName;
        }

        public int getBuildingsAmount()
        {
            return this.buildingsAmount;
        }

        public void setBuildingAmount(int buildingsAmount)
        {
            this.buildingsAmount = buildingsAmount;
        }

        @Override
        public String toString()
        {
            return this.iName + " : "+this.buildingsAmount+" buildings";
        }

    }
}
