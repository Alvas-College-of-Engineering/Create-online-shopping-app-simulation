-- Insert Categories
INSERT INTO categories (id, name, description) VALUES
(1, 'Electronics', 'Gadgets, smartphones, and computers'),
(2, 'Fashion', 'Clothing, shoes, and accessories'),
(3, 'Home & Living', 'Appliances, furniture, and home decor'),
(4, 'Grocery & Food', 'Daily grocery, food, and beverages'),
(5, 'Beauty & Personal Care', 'Cosmetics, skincare, and grooming'),
(6, 'Sports & Fitness', 'Sports equipment and fitness gear');

-- Insert Products
INSERT INTO products (name, description, price, stock_quantity, category_id, image_url) VALUES
-- Electronics (Category 1)
('Apple iPhone 15 Pro', 'Premium smartphone with Pro camera system.', 129999.00, 50, 1, '/images/iphone.png'),
('Samsung Galaxy S24 Ultra', 'High-end Android smartphone with AI.', 119999.00, 45, 1, 'https://images.unsplash.com/photo-1610945265064-0e34e5519bbf?w=1920&q=80'),
('OnePlus 12 Smartphone', 'Flagship killer with excellent performance.', 64999.00, 60, 1, 'https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?w=1920&q=80'),
('Apple MacBook Air M3', 'Lightweight powerful laptop with M3 chip.', 114999.00, 30, 1, '/images/macbook.png'),
('Dell XPS 15 Laptop', 'High-performance laptop with stunning display.', 145000.00, 25, 1, 'https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=1920&q=80'),
('Sony WH-1000XM5 Headphones', 'Industry-leading noise-canceling headphones.', 29999.00, 100, 1, 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=1920&q=80'),
('Apple iPad Pro', 'Powerful tablet for professionals.', 89999.00, 40, 1, 'https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=1920&q=80'),
('Canon DSLR Camera', 'High-resolution digital SLR camera.', 74999.00, 20, 1, 'https://images.unsplash.com/photo-1516035069371-29a1b244cc32?w=1920&q=80'),
('Smart LED TV 55 Inch', '4K UHD Smart TV with excellent picture quality.', 52999.00, 15, 1, 'https://images.unsplash.com/photo-1593784991095-a205069470b6?w=1920&q=80'),
('Gaming Keyboard RGB', 'Mechanical keyboard with RGB backlight.', 4999.00, 150, 1, 'https://images.unsplash.com/photo-1511467687858-23d96c32e4ae?w=1920&q=80'),
('Smart Watch Pro', 'Advanced fitness and health tracking smartwatch.', 7499.00, 200, 1, 'https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=1920&q=80'),
('Bluetooth Speaker', 'Portable waterproof bluetooth speaker.', 3299.00, 120, 1, 'https://images.unsplash.com/photo-1589003077984-894e133dabab?w=1920&q=80'),

-- Fashion (Category 2)
('Men''s Denim Jacket', 'Classic blue denim jacket for men.', 2499.00, 200, 2, 'https://loremflickr.com/800/800/denim,jacket/all?lock=201'),
('Women''s Casual Dress', 'Comfortable everyday casual dress.', 1999.00, 150, 2, 'https://loremflickr.com/800/800/dress,fashion/all?lock=202'),
('Nike Air Max Shoes', 'Popular sports and casual sneakers.', 7999.00, 80, 2, 'https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=1920&q=80'),
('Leather Handbag', 'Premium quality leather handbag for women.', 3499.00, 60, 2, 'https://images.unsplash.com/photo-1584917865442-de89df76afd3?w=1920&q=80'),
('Luxury Wrist Watch', 'Elegant watch for all occasions.', 5999.00, 100, 2, 'https://images.unsplash.com/photo-1522312346375-d1a52e2b99b3?w=1920&q=80'),
('Men''s Hoodie', 'Cozy and stylish hoodie for men.', 1799.00, 250, 2, 'https://loremflickr.com/800/800/hoodie,men/all?lock=206'),
('Women''s Sunglasses', 'Trendy sunglasses with UV protection.', 1299.00, 300, 2, 'https://loremflickr.com/800/800/sunglasses,fashion/all?lock=207'),
('Running Shoes', 'Lightweight performance running shoes.', 4599.00, 120, 2, '/images/shoes.png'),
('Formal Suit', 'Premium tailored formal suit.', 9999.00, 40, 2, '/images/suit.png'),
('Women''s Heels', 'Elegant high heels for special occasions.', 2999.00, 90, 2, 'https://loremflickr.com/800/800/heels,shoes/all?lock=210'),
('Casual T-Shirt', 'Comfortable cotton casual t-shirt.', 999.00, 400, 2, 'https://loremflickr.com/800/800/tshirt,casual/all?lock=211'),
('Leather Wallet', 'Genuine leather bi-fold wallet.', 1499.00, 200, 2, 'https://loremflickr.com/800/800/wallet,leather/all?lock=212'),

-- Home & Living (Category 3)
('Modern Table Lamp', 'Stylish table lamp for study or bedside.', 1499.00, 100, 3, '/images/lamp.png'),
('Wooden Study Desk', 'Ergonomic wooden desk for home office.', 8999.00, 40, 3, '/images/desk.png'),
('Luxury Sofa Set', 'Comfortable premium 3-seater sofa.', 24999.00, 15, 3, '/images/sofa.png'),
('Indoor Plant Pot', 'Ceramic pot with an air-purifying indoor plant.', 799.00, 150, 3, 'https://images.unsplash.com/photo-1484154218962-a197022b5858?w=1920&q=80'),
('Wall Art Frame', 'Beautiful framed canvas for wall decor.', 999.00, 120, 3, 'https://images.unsplash.com/photo-1513519245088-0e12902e5a38?w=1920&q=80'),
('Dining Table Set', 'Elegant 6-seater wooden dining table.', 14999.00, 20, 3, '/images/dining.png'),
('Kitchen Storage Rack', 'Multi-tier storage rack for kitchen utilities.', 2299.00, 80, 3, 'https://loremflickr.com/800/800/rack,kitchen/all?lock=307'),
('Decorative Vase', 'Beautiful ceramic decorative vase.', 1199.00, 100, 3, 'https://loremflickr.com/800/800/vase,decor/all?lock=308'),
('Office Chair', 'Ergonomic adjustable office chair.', 6999.00, 60, 3, 'https://loremflickr.com/800/800/chair,office/all?lock=309'),
('Queen Size Bed', 'Sturdy wooden queen size bed frame.', 29999.00, 10, 3, '/images/bed.png'),
('Smart Ceiling Light', 'WiFi enabled smart LED ceiling light.', 2499.00, 90, 3, 'https://loremflickr.com/800/800/light,ceiling/all?lock=311'),
('Luxury Curtains', 'Premium blackout curtains for living room.', 3999.00, 70, 3, '/images/curtains.png'),

-- Grocery & Food (Category 4)
('Organic Fresh Apples', 'Farm-fresh sweet organic apples (1kg).', 299.00, 500, 4, 'https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?w=1920&q=80'),
('Premium Coffee Beans', 'Richly roasted Arabica coffee beans.', 599.00, 200, 4, 'https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=1920&q=80'),
('Chocolate Gift Box', 'Assorted premium chocolate truffles.', 799.00, 150, 4, 'https://images.unsplash.com/photo-1511381939415-e44015466834?w=1920&q=80'),
('Fresh Vegetable Basket', 'Mix of daily essential fresh vegetables.', 499.00, 100, 4, 'https://images.unsplash.com/photo-1542838132-92c53300491e?w=1920&q=80'),
('Healthy Breakfast Cereal', 'Nutritious mixed grain cereal.', 399.00, 300, 4, 'https://images.unsplash.com/photo-1515003197210-e0cd71810b5f?w=1920&q=80'),
('Almond Dry Fruits', 'Premium quality California almonds.', 899.00, 250, 4, 'https://loremflickr.com/800/800/almonds,nuts/all?lock=406'),
('Fresh Orange Juice', '100% pure fresh squeezed orange juice.', 199.00, 150, 4, 'https://loremflickr.com/800/800/orangejuice,drink/all?lock=407'),
('Green Tea Pack', 'Antioxidant-rich organic green tea.', 349.00, 300, 4, 'https://loremflickr.com/800/800/greentea,tea/all?lock=408'),
('Cheese Pizza', 'Frozen ready-to-bake cheese pizza.', 499.00, 100, 4, 'https://loremflickr.com/800/800/pizza,food/all?lock=409'),
('Protein Energy Bars', 'Pack of 6 nutritious energy bars.', 699.00, 200, 4, 'https://loremflickr.com/800/800/energybar,protein/all?lock=410'),
('Organic Honey Jar', 'Pure raw organic honey.', 599.00, 180, 4, 'https://loremflickr.com/800/800/honey,jar/all?lock=411'),
('Strawberry Cake', 'Freshly baked strawberry delight cake.', 899.00, 50, 4, 'https://loremflickr.com/800/800/cake,strawberry/all?lock=412'),

-- Beauty & Personal Care (Category 5)
('Vitamin C Face Serum', 'Brightening face serum for glowing skin.', 899.00, 250, 5, 'https://images.unsplash.com/photo-1620916566398-39f1143ab7be?w=1920&q=80'),
('Matte Lipstick Set', 'Set of 3 long-lasting matte lipsticks.', 1299.00, 300, 5, 'https://images.unsplash.com/photo-1586495777744-4413f21062fa?w=1920&q=80'),
('Luxury Perfume', 'Premium fragrance with long-lasting notes.', 4999.00, 80, 5, 'https://images.unsplash.com/photo-1541643600914-78b084683601?w=1920&q=80'),
('Skin Care Kit', 'Complete daily skincare routine set.', 2499.00, 100, 5, 'https://images.unsplash.com/photo-1556228578-8c89e6adf883?w=1920&q=80'),
('Hair Dryer Pro', 'Professional hair dryer with multiple settings.', 2999.00, 150, 5, 'https://images.unsplash.com/photo-1522335789203-aabd1fc54bc9?w=1920&q=80'),
('Aloe Vera Gel', 'Pure soothing aloe vera skin gel.', 399.00, 300, 5, 'https://loremflickr.com/800/800/aloevera,gel/all?lock=506'),
('Face Wash Foam', 'Gentle foaming daily face cleanser.', 299.00, 400, 5, 'https://loremflickr.com/800/800/facewash,clean/all?lock=507'),
('Shampoo & Conditioner', 'Nourishing hair care combo pack.', 799.00, 250, 5, 'https://loremflickr.com/800/800/shampoo,hair/all?lock=508'),
('Nail Polish Kit', 'Set of 5 vibrant nail polish colors.', 599.00, 200, 5, 'https://loremflickr.com/800/800/nailpolish,beauty/all?lock=509'),
('Men''s Grooming Kit', 'Complete grooming essential kit for men.', 1999.00, 150, 5, 'https://loremflickr.com/800/800/grooming,men/all?lock=510'),
('Body Lotion', 'Deep moisturizing daily body lotion.', 499.00, 300, 5, 'https://loremflickr.com/800/800/lotion,skincare/all?lock=511'),
('Facial Roller Set', 'Rose quartz facial massaging roller.', 999.00, 120, 5, 'https://loremflickr.com/800/800/roller,face/all?lock=512'),

-- Sports & Fitness (Category 6)
('Adjustable Dumbbells', 'Space-saving adjustable weight dumbbells.', 6999.00, 40, 6, 'https://images.unsplash.com/photo-1517836357463-d25dfeac3438?w=1920&q=80'),
('Yoga Mat Premium', 'Non-slip eco-friendly yoga mat.', 1299.00, 200, 6, 'https://images.unsplash.com/photo-1518611012118-696072aa579a?w=1920&q=80'),
('Mountain Bicycle', 'Durable mountain bike for all terrains.', 18999.00, 20, 6, 'https://images.unsplash.com/photo-1507035895480-2b3156c31fc8?w=1920&q=80'),
('Smart Fitness Band', 'Activity tracker with heart rate monitor.', 3499.00, 150, 6, '/images/band.png'),
('Football Training Kit', 'Complete training kit for football practice.', 2299.00, 80, 6, 'https://images.unsplash.com/photo-1574629810360-7efbbe195018?w=1920&q=80'),
('Cricket Bat Pro', 'Professional grade English willow cricket bat.', 4999.00, 50, 6, 'https://loremflickr.com/800/800/cricket,bat/all?lock=606'),
('Gym Gloves', 'Breathable weightlifting gym gloves.', 799.00, 300, 6, 'https://loremflickr.com/800/800/gloves,gym/all?lock=607'),
('Basketball', 'Official size indoor/outdoor basketball.', 1299.00, 100, 6, 'https://loremflickr.com/800/800/basketball,sports/all?lock=608'),
('Resistance Bands', 'Set of 5 heavy duty resistance bands.', 999.00, 250, 6, 'https://loremflickr.com/800/800/bands,workout/all?lock=609'),
('Treadmill Machine', 'Foldable home running treadmill.', 39999.00, 10, 6, 'https://loremflickr.com/800/800/treadmill,gym/all?lock=610'),
('Protein Shaker Bottle', 'Leak-proof gym shaker bottle.', 599.00, 400, 6, 'https://loremflickr.com/800/800/shaker,bottle/all?lock=611'),
('Skipping Rope', 'Adjustable speed jump rope for cardio.', 399.00, 500, 6, 'https://loremflickr.com/800/800/jumprope,fitness/all?lock=612');

-- Insert a test user
INSERT INTO users (username, password, email, role, full_name, address, phone) VALUES
('testuser', 'password', 'test@example.com', 'USER', 'Test User', '123 Test Street, City', '1234567890');
