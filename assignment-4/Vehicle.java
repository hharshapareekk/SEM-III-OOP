interface Vehicle{
	void changeGear(int gear);
	void incSpeed(int inc);
	void applyBreak();
	static boolean validateSpeed(int currSpeed,int maxSpeed){
    	if(currSpeed>maxSpeed)
    	{
        	System.out.println("over speed");
        	return false;
    	}
    	else if(currSpeed<0)
    	{
        	return false;
    	}
    	else {
        	return true;
    	}

	}
	static boolean validateGear(int gear,int maxGear)
	{
    	if(gear<0)
    	{
        	return false;
    	}
    	else if(gear>maxGear)
    	{

        	System.out.println("Invalid ");

        	return false;
    	}
    	else {
        	return true;
    	}
	}

}
