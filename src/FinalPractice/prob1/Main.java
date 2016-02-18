package FinalPractice.prob1;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import FinalPractice.helperclasses.*;

/*public static final BiFunction<CheckoutRecord, LocalDate, Boolean> HAS_OVERDUE = 
(record, dateToCheckAgainst)-> record.getCheckoutRecordEntries().stream()
.map(e->!e.getCopy().isAvailable() &&
		 e.getDueDate().isBefore(dateToCheckAgainst))
.reduce(false,(a,b)->a||b);*/

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<CheckoutRecord> checkoutRecords = TestData.INSTANCE.getAllRecords();
		/*for(CheckoutRecord checkOutRec: checkoutRecords){
			List<CheckoutRecordEntry> checkoutRecordEntry = checkOutRec.getCheckoutRecordEntries();
			checkoutRecordEntry.stream().map(x->x.getCopy().getBook().getTitle());
		}*/
		//supposing one member
		List<LibraryMember> memberList =  TestData.INSTANCE.getMembers();
		CheckoutRecord checkoutrecord = memberList.get(0).getRecord();
		
		System.out.println(
				checkoutrecord.getCheckoutRecordEntries().stream()
						.map(e->!e.getCopy().isAvailable() && e.getDueDate().isBefore(LocalDate.now()))
								.reduce(false, (a,b)->a||b)
							
				);
		
	}

}
