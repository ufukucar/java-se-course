package com.ufukucar;


import com.ufukucar.data.AgentDAO;
import com.ufukucar.data.BuyerDAO;
import com.ufukucar.data.PropertyDAO;
import com.ufukucar.data.SellerDAO;
import com.ufukucar.model.Agent;
import com.ufukucar.model.Buyer;
import com.ufukucar.model.Property;
import com.ufukucar.model.Seller;
import com.ufukucar.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class AppMain {
    public static void main(String[] args) {


        AgentDAO agentDAO = new AgentDAO();
        BuyerDAO buyerDAO = new BuyerDAO();
        SellerDAO sellerDAO = new SellerDAO();
        PropertyDAO propertyDAO = new PropertyDAO();


        Agent agent1 = new Agent();
        agent1.setFirstName("Samet");
        agent1.setLastName("Furkan");
        agent1.setEmail("samet@gmail.com");
        agent1.setPhone("123456789");
        agent1.setOfficeAddress("Ankara");
        agentDAO.saveOrUpdateAgent(agent1);

        Agent agent2 = new Agent();
        agent2.setFirstName("Veysel");
        agent2.setLastName("Ekinci");
        agent2.setEmail("veysel@gmail.com");
        agent2.setPhone("789364336546");
        agent2.setOfficeAddress("İzmir");
        agentDAO.saveOrUpdateAgent(agent2);



        Buyer buyer1 = new Buyer();
        buyer1.setFirstName("Selahattin");
        buyer1.setLastName("Dişli");
        buyer1.setEmail("selahattin@gmail.com");
        buyer1.setPhone("4567874244");
        buyerDAO.saveOrUpdateBuyer(buyer1);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Zeynep");
        buyer2.setLastName("Coşkun");
        buyer2.setEmail("zeynep@gmail.com");
        buyer2.setPhone("5235642155345");
        buyerDAO.saveOrUpdateBuyer(buyer2);



        Seller seller1 = new Seller();
        seller1.setFirstName("Muhammed");
        seller1.setLastName("Mamadow");
        seller1.setEmail("muhammed@gmail.com");
        buyer1.setPhone("54338744385");
        SellerDAO.saveOrUpdateSeller(seller1);


        Seller seller2 = new Seller();
        seller2.setFirstName("Sadk");
        seller2.setLastName("Kuzu");
        seller2.setEmail("sadik@gmail.com");
        seller2.setPhone("111112343243");
        SellerDAO.saveOrUpdateSeller(seller2);



        Property property1 = new Property();
        property1.setPropertyName("Abc");
        property1.setTitle("Hotel");
        property1.setDescription("Turistlik Belde");
        property1.setType("Satılık");
        property1.setPrice(10_000_000.0);

        // İlişki - Relation
        property1.setAgent(agent1); // sadece bir emlakçı satabilir
        property1.setSeller(seller1); // sadece bir kişi satabilir
        property1.getBuyers().add(buyer1); // bir gayrimenkulü birden fazla kişi satın alabilir.
        property1.getBuyers().add(buyer2);

        // SAVE - INSERT - CREATE
        propertyDAO.saveOrUpdateProperty(property1);
        property1.setType("Satıldı");
        propertyDAO.saveOrUpdateProperty(property1);


        Property property2 = new Property();
        property2.setPropertyName("Malikane");
        property2.setTitle("Dublex");
        property2.setDescription("Nezih bir konak");
        property2.setType("Satılık");
        property1.setPrice(5_000_000.0);

        propertyDAO.saveOrUpdateProperty(property1);

        System.out.println("--------------------------- AGENT LIST -------------------------------");
        List <Agent> agentList =   agentDAO.getAgentsFindAll();

        for (Agent agent : agentList) {
            System.out.println(agent.getFirstName() + " " + agent.getLastName());
        }

        System.out.println("--------------------------- SELLER LIST -------------------------------");
        List <Seller> sellerList =   SellerDAO.getSellersFindAll();

        for (Seller seller : sellerList) {
            System.out.println(seller.getFirstName() + " " + seller.getLastName());

        }

        System.out.println("--------------------------- BUYER LIST -------------------------------");
        List <Buyer> buyerList =   buyerDAO.getBuyersFindAll();

        for (Buyer buyer : buyerList) {
            System.out.println(buyer.getFirstName() + " " + buyer.getLastName());

        }

        System.out.println("--------------------------- PROPERTY LIST -------------------------------");
        List <Property> propertyList =   propertyDAO.getPropertysFindAll();

        for (Property property : propertyList) {
            System.out.println(property.getTitle() + " " + property.getDescription() + " " + property.getPrice()); ;

        }


        System.out.println("--------------------------- DELETE AGENTLIST -------------------------------");
        agentDAO.deleteAgentFindById(1L);
        List <Agent> agentList1 =   agentDAO.getAgentsFindAll();

        for (Agent agent : agentList1) {
            System.out.println(agent.getFirstName() + " " + agent.getLastName());
        }

        System.out.println("--------------------------- FIND BY ID BUYER -------------------------------");
        Buyer buyerResult1 = buyerDAO.getBuyerFindById(1L);
        System.out.println(buyerResult1.getFirstName() + " " + buyerResult1.getLastName() + " " + buyerResult1.getEmail() + " " + buyerResult1.getPhone());



    }

}
