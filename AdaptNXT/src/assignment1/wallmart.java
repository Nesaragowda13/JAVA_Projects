package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.jsoup.Jsoup;
public class wallmart {
	public static void main(String[] args) throws IOException {
        // Send a GET request to the URL
        String url = "https://www.walmart.com/browse/electronics/dell-gaming-laptops/3944_3951_7052607_1849032_4519159";
        org.jsoup.nodes.Document document = Jsoup.connect(url).get();
        
        // Find all the product items on the page
        org.jsoup.select.Elements products = document.select("div.search-result-gridview-item-wrapper");
        
        // Define the headers for the CSV file
        String[] headers = {"Product Name", "Product Price", "Item Number/SKU/Product Code", "Model Number", "Product Category", "Product Description", "Screen Size", "Processor Type", "Graphics Card", "RAM Size"};
        
        // Create a list to store the product details
        ArrayList<String[]> productDetails = new ArrayList<String[]>();
        
        // Loop through each product item and extract the relevant details
        for (org.jsoup.nodes.Element product : products) {
            String[] details = new String[10];
            details[0] = product.select("a.product-title-link").text().trim();
            details[1] = product.select("span.price-group").text().trim();
            details[2] = product.attr("data-item-id");
            details[3] = product.attr("data-model-number");
            details[4] = product.attr("data-category");
            details[5] = product.select("div.search-result-product-description").text().trim();
            details[6] = product.select("div.search-result-product-specs-value[data-automation-id='screenSizeValue']").text().trim();
            details[7] = product.select("div.search-result-product-specs-value[data-automation-id='processorTypeValue']").text().trim();
            details[8] = product.select("div.search-result-product-specs-value[data-automation-id='graphicsCardValue']").text().trim();
            details[9] = product.select("div.search-result-product-specs-value[data-automation-id='ramSizeValue']").text().trim();
            productDetails.add(details);
        }
        
        // Write the product details to a CSV file
        FileWriter writer = new FileWriter("Walmart_Products.csv");
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(headers));
        for (String[] details : productDetails) {
            csvPrinter.printRecord(details);
        }
        csvPrinter.flush();
        csvPrinter.close();
    }
}
