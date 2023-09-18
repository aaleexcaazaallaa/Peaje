package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.constants.ConstantsClass;

public class TicketEspecial extends Ticket
{
	public TicketEspecial(double kmDistance, double kmPrice) 
	{
		super(kmDistance, kmPrice);
	}
	
	public double calculoTicketEspecial (double kmDistance, double kmPrice) 
	{
		if (kmDistance < ConstantsClass.INT_100)
		{
			this.fee = this.kmDistance * this.kmPrice;
		}
		else if (this.kmDistance >= ConstantsClass.INT_100)
		{
			double discount;
			discount = (this.kmDistance * this.kmPrice) * ConstantsClass.DOUBLE_0_0_5;
			this.fee = (this.kmDistance * this.kmPrice) - discount;
		}
		return fee;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append(ConstantsClass.TICKET_ESPECIAL_FEE);
		builder.append(this.fee);
		builder.append(ConstantsClass.KM_DISTANCE);
		builder.append(this.kmDistance);
		builder.append(ConstantsClass.KM_PRICE);
		builder.append(this.kmPrice);
		builder.append(ConstantsClass.STR_CLOSE_BRACKET);
		return builder.toString();
	}

	@Override
	public void registrarSalida(int kmSalida) 
	{
		
	}
	
	
}
