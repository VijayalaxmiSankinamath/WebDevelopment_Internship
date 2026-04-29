let cartIcon = document.querySelector("#cart-icon")
    let cartItem = document.querySelector(".cart-items");
    let cartClose = document.querySelector(".close-cart");
    
    let count=0

    cartIcon.addEventListener("click", () => {
        cartItem.classList.add("cls")
    })
    cartClose.addEventListener("click", () => {
        cartItem.classList.remove("cls")
    })

    let addCartButtons = document.querySelectorAll(".add-cart");

    addCartButtons.forEach((button) => {
        button.addEventListener("click", (event) => {

            let productBox = event.target.closest(".product-box");
            let productImgSrc = productBox.querySelector(".image-box img").src;
            let productTitle = productBox.querySelector(".product-title").textContent;
            let productPrice = productBox.querySelector(".price").textContent;

            let cartProductTitle = cartItem.querySelectorAll(".cart-product-title");
           

            for (let item of cartProductTitle) {
                if (item.textContent === productTitle) {
                    alert("Product already in cart");
                    return;
                }
            }

            let cartBox = document.createElement("div");
            cartBox.classList.add("cart-box");

            cartBox.innerHTML = `
                <img src="${productImgSrc}" alt="">
                <div class="cart-details">
                    <h2 class="cart-product-title">${productTitle}</h2>
                    <span class="cart-price">${productPrice}</span>
                    <div class="cart-quantity">
                        <button id="decrement">-</button>
                        <span id="number">1</span>
                        <button id="increment">+</button>
                    </div>
                </div>
                <i class="ri-delete-bin-line cart-delete"></i>
            `;

            // ✅ FIX: append to correct container
            document.querySelector(".cart-content").append(cartBox);
            let cartitemCount = document.querySelector(".add-to-cart");
            
            count++;
            cartitemCount.textContent=count;
           //console.log(cartitemCount.textContent);
           
            
            
         
            updateTotalPrice();

            // ✅ DELETE
            cartBox.querySelector(".cart-delete").addEventListener("click", () => {
                cartBox.remove();
                updateTotalPrice()

            });

            // ✅ QUANTITY FIX (your style only)
            let incBtn = cartBox.querySelector("#increment");
            let decBtn = cartBox.querySelector("#decrement");
            let numberElement = cartBox.querySelector("#number");

            incBtn.addEventListener("click", () => {
                let quantity = parseInt(numberElement.textContent);
                numberElement.textContent = quantity + 1;
                updateTotalPrice()
            });

            decBtn.addEventListener("click", () => {
                let quantity = parseInt(numberElement.textContent);
                if (quantity > 1) {
                    numberElement.textContent = quantity - 1;
                }
                updateTotalPrice()
            });

        });


        let updateTotalPrice = () => {

    let cartBoxes = document.querySelectorAll(".cart-box");

    let total = 0;

    cartBoxes.forEach((cartBox) => {
        let priceElement = cartBox.querySelector(".cart-price");
        let quantityElement = cartBox.querySelector("#number");

        let price = parseInt(priceElement.textContent.replace("$", ""));
        let quant = parseInt(quantityElement.textContent);

        total += price * quant;
    });

    document.querySelector(".total-price").textContent = `$${total}`;
}



    });