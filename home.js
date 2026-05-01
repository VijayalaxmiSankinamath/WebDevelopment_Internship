let cartIcon = document.querySelector("#cart-icon")
let cartItem = document.querySelector(".cart-items");
let cartClose = document.querySelector(".close-cart");

let count = 0

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
                        <button class="decrement">-</button>
                        <span class="number">1</span>
                        <button class="increment">+</button>
                    </div>
                </div>
                <i class="ri-delete-bin-line cart-delete"></i>
            `;

        // ✅ FIX: append to correct container
        document.querySelector(".cart-content").append(cartBox);
        let cartitemCount = document.querySelector(".add-to-cart");

        count++;
        cartitemCount.textContent = count;
        //console.log(cartitemCount.textContent);




        updateTotalPrice();

        // ✅ DELETE
        cartBox.querySelector(".cart-delete").addEventListener("click", () => {
            cartBox.remove();
            count--;
            cartitemCount.textContent = count;
            updateTotalPrice();
        });

        // ✅ QUANTITY FIX (your style only)
        let incBtn = cartBox.querySelector(".increment");
        let decBtn = cartBox.querySelector(".decrement");
        let numberElement = cartBox.querySelector(".number");

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


    function updateTotalPrice() {
    let cartBoxes = document.querySelectorAll(".cart-box");
    let total = 0;

    cartBoxes.forEach((cartBox) => {
        let price = parseInt(cartBox.querySelector(".cart-price").textContent.replace("$", ""));
        let quant = parseInt(cartBox.querySelector(".number").textContent);
        total += price * quant;
    });

    document.querySelector(".total-price").textContent = `$${total}`;
}

let buyBtn = document.querySelector(".btn-buy");
let popup = document.querySelector("#div1");
let closePopup = document.querySelector(".close-popup");

// open popup
buyBtn.addEventListener("click", () => {
    popup.style.display = "flex";
});

// close popup
closePopup.addEventListener("click", () => {
    popup.style.display = "none";
});

// optional: click outside to close
popup.addEventListener("click", (e) => {
    if (e.target === popup) {
        popup.style.display = "none";
    }
});


});