package fr.lille.api;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class Checker {

	private HashMap<File, Long> mapFile = new HashMap();
	private ArrayList<File> files;
	private ArrayList<File> newFiles;
	private String dirPath;
	private boolean firstCheck = true;
	
	public Checker(String dirPath) {
		this.files = new ArrayList<File>();
		this.newFiles = new ArrayList<File>();
		this.dirPath = dirPath;
		File directory = new File(this.dirPath);
		File[] contents = directory.listFiles();
		for (File f : contents) {
			mapFile.put(f, f.lastModified());
			files.add(f);
			//System.out.println("File added : " + f.getName());
		}
	}

	public void showAllList()
	{
		for (File f : this.files)
		{
			System.out.println("This files original : " + f.getName());
		}
		
		for (File f : this.newFiles)
		{
			System.out.println("This files new : " + f.getName());
		}
		
		for (Map.Entry<File, Long> entry : this.mapFile.entrySet()) {
			System.out.println("hashmap :  " + entry.getKey().getName() +  "  " +  entry.getValue());
		}
		
	}
	
	public void originalCheck(BundleContext bc)
	{
		try {
			installBundle(bc);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (BundleException e) {
			e.printStackTrace();
		}
		firstCheck = false;
	}
	
	public void start(BundleContext bc) throws BundleException, MalformedURLException {
		if (firstCheck)
			originalCheck(bc);
		checking_newFile();
		checkModifiedFile(bc);
		checkIfDeleted(bc);
		installNewBundle(bc);
		//showAllList();		 
	}

	public void installBundle(BundleContext bc) throws BundleException, MalformedURLException {
		System.out.println("Entered installBundle");
		for (File f : this.files) {
			if (isBundleFile(f) && (bc.getBundle(f.toURI().toURL().toString()) == null)) {
				System.out.println("Installation auto du bundle " + f.getName());
				bc.installBundle(f.toURI().toURL().toString());
				bc.getBundle(f.toURI().toURL().toString()).start();
			}
			else if (isBundleFile(f) && (bc.getBundle(f.toURI().toURL().toString()) != null))
			{
				bc.getBundle(f.toURI().toURL().toString()).update();
				bc.getBundle(f.toURI().toURL().toString()).start();
			}
		}
	}
	
	public void checkModifiedFile(BundleContext bc) {
		System.out.println("Entered modified file");
		File directory = new File(this.dirPath);
		File[] contents = directory.listFiles();

		for (Map.Entry<File, Long> entry : this.mapFile.entrySet()) {
			for (File f2 : contents) {
				if (entry.getKey().getName().equals(f2.getName())) {
					if ((entry.getValue() != (f2.lastModified())))
					{
						//System.out.println("the file has been modified " + entry.getKey().getName() + " original date : " + entry.getValue());
						this.mapFile.put(f2, f2.lastModified());
						if (isBundleFile(f2))
						{
						try {
							bc.getBundle(f2.toURI().toURL().toString()).update();
						} catch (MalformedURLException e) {
							e.printStackTrace();
						} catch (BundleException e) {
							e.printStackTrace();
						}
						}
						//System.out.println("the file which has been modified " + entry.getKey().getName() + " new date : " + entry.getValue());
					}
				}
			}
		}
	}

	public void checkIfDeleted(BundleContext bc) {
		System.out.println("Entered Deleted Check");
		File directory = new File(this.dirPath);
		File[] contents = directory.listFiles();
		ArrayList<File> arFile = new ArrayList<File>();

		for (File f : contents) {
			arFile.add(f);
		}
		for (File f : this.files) {
			if (!arFile.contains(f)) {
				//System.out.println("The file " + f.getName() + " has been deleted");
				if (isBundleFile(f))
				{
				try {
					bc.getBundle(f.toURI().toURL().toString()).stop();
					bc.getBundle(f.toURI().toURL().toString()).uninstall();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (BundleException e) {
					e.printStackTrace();
				}
				}
				this.mapFile.remove(f);
			}
		}
		this.files = arFile;
	}

	public void checking_newFile() {
		File directory = new File(this.dirPath);
		File[] contents = directory.listFiles();

		System.out.println("Entered Checking");
		for (File f : contents) {
			// System.out.println("the file checked is : " + f.getName());
			if (!this.files.contains(f)) {
				// System.out.println("this file is new ! " + f.getName());
				this.newFiles.add(f);
			}
		}
	}

	public void installNewBundle(BundleContext bc) throws BundleException, MalformedURLException {
		System.out.println("Entered installifBundle");
		for (File f : this.newFiles) {
			System.out.println("file is = " + f.getName());
			if (isBundleFile(f)) {
				System.out.println("Installation auto du bundle " + f.getName());
				bc.installBundle(f.toURI().toURL().toString());
				bc.getBundle(f.toURI().toURL().toString()).start();
			}
			this.files.add(f);
			this.mapFile.put(f, f.lastModified());
		}
		this.newFiles.clear();
	}

	boolean isBundleFile(File f) {
		return f.toString().toLowerCase().endsWith(".jar");
	}
}
