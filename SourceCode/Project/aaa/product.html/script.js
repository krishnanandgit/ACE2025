document.addEventListener('DOMContentLoaded', function() {
    const products = [
        {
            name: 'Product 1',
            price: '$19.99',
            description: 'Description for product 1',
            image: 'https://via.placeholder.com/150'
        },
        {
            name: 'Product 2',
            price: '$29.99',
            description: 'Description for product 2',
            image: 'https://via.placeholder.com/150'
        },
        {
            name: 'Product 3',
            price: '$39.99',
            description: 'Description for product 3',
            image: 'https://via.placeholder.com/150'
        }
        // Add more products as needed
    ];

    const productList = document.getElementById('product-list');

    products.forEach(product => {
        const productElement = document.createElement('div');
        productElement.className = 'product';

        productElement.innerHTML = `
            <img src="${product.image}" alt="${product.name}">
            <div class="product-details">
                <div class="product-name">${product.name}</div>
                <div class="product-price">${product.price}</div>
                <div class="product-description">${product.description}</div>
            </div>
        `;

        productList.appendChild(productElement);
    });
});
