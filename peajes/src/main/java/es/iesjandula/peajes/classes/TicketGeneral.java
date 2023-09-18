package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.constants.ConstantsClass;

public class TicketGeneral extends Ticket
{
	public TicketGeneral(double kmDistance, double kmPrice) 
	{
		super(kmDistance, kmPrice);
	}

	public double calculoTicketGeneral (double kmDistance, double kmPrice) 
	{
		if (kmDistance < ConstantsClass.INT_500)
		{
			this.fee = this.kmDistance * this.kmPrice;
		}
		else if (this.kmDistance >= ConstantsClass.INT_500)
		{
			double discount;
			discount = (this.kmDistance * this.kmPrice) * ConstantsClass.DOUBLE_0_1;
			this.fee = (this.kmDistance * this.kmPrice) - discount;
		}
		return fee;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append(ConstantsClass.TICKET_GENERAL_FEE);
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
