package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.constants.ConstantsClass;
import es.iesjandula.peajes.interfaces.ITicket;

public class Ticket implements ITicket
{
	protected double fee;
	protected double kmDistance;
	protected double kmPrice;
	
	public Ticket(double kmDistance, double kmPrice)
	{
		super();
		this.kmDistance = kmDistance;
		this.kmPrice = kmPrice;
	}
	
	/**
	 * @return the fee
	 */
	public double getFee() 
	{
		return this.fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) 
	{
		this.fee = fee;
	}

	/**
	 * @return the kmDistance
	 */
	public double getKmDistance() 
	{
		return this.kmDistance;
	}

	/**
	 * @param kmDistance the kmDistance to set
	 */
	public void setKmDistance(double kmDistance) 
	{
		this.kmDistance = kmDistance;
	}

	/**
	 * @return the kmPrice
	 */
	public double getKmPrice() 
	{
		return this.kmPrice;
	}

	/**
	 * @param kmPrice the kmPrice to set
	 */
	public void setKmPrice(double kmPrice) 
	{
		this.kmPrice = kmPrice;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null) 
		{
			return false;
		}
		else if (this == obj) 
		{
			return true;
		}
		else if (!(obj instanceof Ticket))
		{
			return false;
		}	
		Ticket other = (Ticket) obj;
		return true;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ConstantsClass.TICKET_FEE);
		builder.append(this.fee);
		builder.append(ConstantsClass.KM_DISTANCE);
		builder.append(this.kmDistance);
		builder.append(ConstantsClass.KM_PRICE);
		builder.append(this.kmPrice);
		builder.append(ConstantsClass.STR_CLOSE_BRACKET);
		return builder.toString();
	}

	@Override
	public void registrarSalida(int kmSalida) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
