
import static utils.TextIO.getln;
import static utils.TextIO.putln;
import static utils.TextIO.writeFile;
import static utils.TextIO.writeStandardOutput;

import java.util.Scanner;
import java.util.Vector;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.TextIO;

/**
 * @overview PCProg is a program that captures data about PC objects and
 *           displays a report about them on the console.
 * 
 * @attributes objs Set<PC>
 * 
 * @object A typical PCProg is {c1,...,cn} where c1,...,cn are pcs
 * 
 * @abstract_properties mutable(objs)=true /\ optional(objs)=false
 * 
 * @author dmle
 */
public class PCProg {
	private static final Object YES = "Y";
	@DomainConstraint(mutable = true, optional = false)
	private Set<PC> objs;

	/**
	 * @effects initialise this to have an empty set of PCs
	 */
	public PCProg() {
		objs = new Set<>();
	}

	/**
	 * @effects if objs is not empty display to the standard console a text-based
	 *          tabular report on objs return this report else display nothing and
	 *          return null
	 */
	public String displayReport() {
		if (objs.size() > 0) {
			Vector<PC> pcs = objs.getElements();

			PCReport reportObj = new PCReport();
			return reportObj.displayReport(pcs.toArray(new PC[pcs.size()]));
		} else {
			return null;
		}
	}

	/**
	 * @effects save report to a file pcs.txt in the same directory as the program's
	 */
	public void saveReport(String report) {
		String fileName = "pcs.txt";
		writeFile(fileName);
		putln(report);
		writeStandardOutput();
	}

	public void createObjects() {
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("Enter the model: ");
				String model = sc.nextLine().trim();
				if (model.isEmpty() || model.length() > 20) {
					throw new NotPossibleException("Please enter a model (length above 20 characters): ");
				}
				sc.nextLine();

				System.out.println("Enter the year: ");
				int year = sc.nextInt();
				if (year < 1984) {
					throw new NotPossibleException("Please enter a year after 1984: ");
				}

				sc.nextLine();

				System.out.println("Enter the manufacturer: ");
				String manufacturer = sc.nextLine().trim();
				if (manufacturer.length() > 15) {
					throw new NotPossibleException("Please enter a manufacturer (up to 15 characters): ");
				}

				Set<String> components = new Set<>();
				System.out.println("Enter components (press Enter without input to finish): ");
				while (true) {
					String component = sc.nextLine().trim();
					if (component.isEmpty()) {
						break;
					}
					components.insert(component);
				}

				PC pc = new PC(model, year, manufacturer, components);
				objs.insert(pc);

				System.out.println("Do you want to continue (Y/N): ");
				String choice = sc.nextLine().trim();
				if (!choice.equals(YES)) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			createObjects();
		}
	}




	/**
	 * The run method
	 * 
	 * @effects initialise an instance of PCProg create objects from data entered by
	 *          the user display a report on the objects prompt user to save report
	 *          to file if user answers "Y" save report else end
	 */
	public static void main(String[] args) {
		//
		PCProg prog = new PCProg();

		// create objects
		try {
			prog.createObjects();
			// display report
			String report = prog.displayReport();
			System.out.println(report);
			if (report != null) {
				// prompt user to save report
				putln("Save report to file? [Y/N]");
				String toSave = getln();
				if (toSave.equals("Y")) {
					prog.saveReport(report);
					putln("report saved");
				}
			}

		} catch (NotPossibleException e) {
			System.err.printf("%s: %s%n", e, e.getMessage());
		}
		putln("~END~");
	}

}
