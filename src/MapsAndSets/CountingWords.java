package MapsAndSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class CountingWords {
	public static void main(String[] args) {

		HashSet<String> words = OpenWebSite();

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();

		for (String w : words) {
			if (!map.containsKey(w)) {
				map.put(w, 1);
				System.out.println("");
			}
			else {
				int value = map.get(w);
				map.put(w, value+=1);
			}
		}


		// Get all entries into a set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry: entrySet)
		System.out.println(entry.getKey() + "\t" + entry.getValue());
	}

	private static HashSet<String> OpenWebSite() {
		URL url;
	    InputStream is = null;
	    BufferedReader br;
	    String line;
	    HashSet<String> wordsCollection = null;
	    try {
	        url = new URL("http://www.textfiles.com/etext/FICTION/kipling-jungle-148.txt");
	        is = url.openStream();  // throws an IOException
	        br = new BufferedReader(new InputStreamReader(is));

	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	            wordsCollection = new HashSet<String>(Arrays.asList(line.split("A-Za-z")));
	        }
	    } catch (MalformedURLException mue) {
	         mue.printStackTrace();
	    } catch (IOException ioe) {
	         ioe.printStackTrace();
	    } finally {
	        try {
	            if (is != null) is.close();
	        } catch (IOException ioe) {
	            // nothing to see here
	        }
	    }
		return wordsCollection;
	}
}
