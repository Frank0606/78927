let uri = ''

document.addEventListener('DOMContentLoaded', () => {
    const btnComprar = document.getElementById("btnComprar")
    btnComprar.addEventListener('click', () => {
        const solicitarCompraRequest = `
            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:com="http://example.com/compras">
                <soapenv:Header/>
                <soapenv:Body>
                    <com:CompraRequest>
                        <com:Cliente>
                            <com:Nombre>Juan</com:Nombre>
                            <com:Email>juan@example.com</com:Email>
                        </com:Cliente>
                        <com:Productos>
                            <com:Producto>
                                <com:Nombre>Producto1</com:Nombre>
                                <com:Cantidad>2</com:Cantidad>
                            </com:Producto>
                        </com:Productos>
                    </com:CompraRequest>
                </soapenv:Body>
            </soapenv:Envelope>
        `

        fetch(uri, {
            method: "POST",
            headers: {
                "Content-Type": "text/xml"
            },
            body: JSON.stringify(solicitarCompraRequest)
        })
            .then(response => response.json())
            .then(data => console.log(data))
            .catch(error => console.error("Error:", error));
    })
})